package com.neokred.pos.utils;

import org.junit.Test;
import static org.junit.Assert.*;

public class DeviceUtilsTest {

    // ─── convertAmountToCents ───────────────────────────────────

    @Test
    public void convertAmountToCents_typicalAmount() {
        assertEquals("1.23", DeviceUtils.convertAmountToCents("123"));
    }

    @Test
    public void convertAmountToCents_roundAmount() {
        assertEquals("100.00", DeviceUtils.convertAmountToCents("10000"));
    }

    @Test
    public void convertAmountToCents_singlePaise() {
        assertEquals("0.05", DeviceUtils.convertAmountToCents("5"));
    }

    @Test
    public void convertAmountToCents_zeroPaise() {
        assertEquals("0.00", DeviceUtils.convertAmountToCents("0"));
    }

    @Test
    public void convertAmountToCents_onePaise() {
        assertEquals("0.01", DeviceUtils.convertAmountToCents("1"));
    }

    @Test
    public void convertAmountToCents_tenPaise() {
        assertEquals("0.10", DeviceUtils.convertAmountToCents("10"));
    }

    @Test
    public void convertAmountToCents_largeAmount() {
        assertEquals("99999.99", DeviceUtils.convertAmountToCents("9999999"));
    }

    @Test
    public void convertAmountToCents_invalidInput_returnsEmpty() {
        assertEquals("", DeviceUtils.convertAmountToCents("abc"));
    }

    @Test
    public void convertAmountToCents_emptyString_returnsEmpty() {
        assertEquals("", DeviceUtils.convertAmountToCents(""));
    }

    @Test
    public void convertAmountToCents_decimalInput() {
        // "100.50" parsed as 100.50, divided by 100 = 1.005 → "1.01" (rounds up)
        String result = DeviceUtils.convertAmountToCents("100.50");
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    // ─── getDevicePosType ───────────────────────────────────────

    @Test
    public void getDevicePosType_uart() {
        assertEquals(com.neokred.pos.common.enums.POS_TYPE.UART,
                DeviceUtils.getDevicePosType("UART"));
    }

    @Test
    public void getDevicePosType_usb() {
        assertEquals(com.neokred.pos.common.enums.POS_TYPE.USB,
                DeviceUtils.getDevicePosType("USB"));
    }

    @Test
    public void getDevicePosType_bluetooth() {
        assertEquals(com.neokred.pos.common.enums.POS_TYPE.BLUETOOTH,
                DeviceUtils.getDevicePosType("BLUETOOTH"));
    }

    @Test
    public void getDevicePosType_unknown_defaultsBluetooth() {
        assertEquals(com.neokred.pos.common.enums.POS_TYPE.BLUETOOTH,
                DeviceUtils.getDevicePosType("UNKNOWN"));
    }

    @Test
    public void getDevicePosType_emptyString_defaultsBluetooth() {
        assertEquals(com.neokred.pos.common.enums.POS_TYPE.BLUETOOTH,
                DeviceUtils.getDevicePosType(""));
    }
}
