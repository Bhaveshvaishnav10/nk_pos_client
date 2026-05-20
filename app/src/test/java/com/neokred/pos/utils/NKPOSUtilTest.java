package com.neokred.pos.utils;

import org.junit.Test;
import static org.junit.Assert.*;

public class NKPOSUtilTest {

    // ─── byteArray2Hex ──────────────────────────────────────────

    @Test
    public void byteArray2Hex_null_returnsNull() {
        assertNull(NKPOSUtil.byteArray2Hex(null));
    }

    @Test
    public void byteArray2Hex_emptyArray_returnsEmptyString() {
        assertEquals("", NKPOSUtil.byteArray2Hex(new byte[]{}));
    }

    @Test
    public void byteArray2Hex_singleByte_zeroPad() {
        assertEquals("0F", NKPOSUtil.byteArray2Hex(new byte[]{0x0F}));
    }

    @Test
    public void byteArray2Hex_typicalBytes() {
        assertEquals("DEADBEEF", NKPOSUtil.byteArray2Hex(
                new byte[]{(byte)0xDE, (byte)0xAD, (byte)0xBE, (byte)0xEF}));
    }

    @Test
    public void byteArray2Hex_allZeros() {
        assertEquals("00000000", NKPOSUtil.byteArray2Hex(new byte[]{0, 0, 0, 0}));
    }

    @Test
    public void byteArray2Hex_allFF() {
        assertEquals("FFFFFFFF", NKPOSUtil.byteArray2Hex(
                new byte[]{(byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF}));
    }

    // ─── HexStringToByteArray ───────────────────────────────────

    @Test
    public void hexStringToByteArray_null_returnsEmpty() {
        assertArrayEquals(new byte[]{}, NKPOSUtil.HexStringToByteArray(null));
    }

    @Test
    public void hexStringToByteArray_emptyString_returnsEmpty() {
        assertArrayEquals(new byte[]{}, NKPOSUtil.HexStringToByteArray(""));
    }

    @Test
    public void hexStringToByteArray_typicalHex() {
        byte[] result = NKPOSUtil.HexStringToByteArray("DEADBEEF");
        assertArrayEquals(new byte[]{(byte)0xDE, (byte)0xAD, (byte)0xBE, (byte)0xEF}, result);
    }

    @Test
    public void hexStringToByteArray_lowercase() {
        byte[] result = NKPOSUtil.HexStringToByteArray("deadbeef");
        assertArrayEquals(new byte[]{(byte)0xDE, (byte)0xAD, (byte)0xBE, (byte)0xEF}, result);
    }

    @Test
    public void hexStringToByteArray_oddLength_paddedWithLeadingZero() {
        // "F" → "0F" → byte 0x0F
        byte[] result = NKPOSUtil.HexStringToByteArray("F");
        assertArrayEquals(new byte[]{0x0F}, result);
    }

    @Test
    public void hexStringToByteArray_allZeros() {
        byte[] result = NKPOSUtil.HexStringToByteArray("0000");
        assertArrayEquals(new byte[]{0x00, 0x00}, result);
    }

    // ─── roundtrip: byteArray2Hex ↔ HexStringToByteArray ───────

    @Test
    public void roundtrip_hexToBytes_backToHex() {
        String original = "AABBCCDD";
        byte[] bytes = NKPOSUtil.HexStringToByteArray(original);
        String result = NKPOSUtil.byteArray2Hex(bytes);
        assertEquals(original, result);
    }

    // ─── xor8 ───────────────────────────────────────────────────

    @Test
    public void xor8_zeroXorZero_isZero() {
        byte[] a = new byte[8];
        byte[] b = new byte[8];
        byte[] result = NKPOSUtil.xor8(a, b);
        assertArrayEquals(new byte[8], result);
    }

    @Test
    public void xor8_selfXor_isZero() {
        byte[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        byte[] result = NKPOSUtil.xor8(a, a);
        assertArrayEquals(new byte[8], result);
    }

    @Test
    public void xor8_knownValues() {
        byte[] a = {(byte)0xFF, 0, (byte)0xFF, 0, (byte)0xFF, 0, (byte)0xFF, 0};
        byte[] b = {0, (byte)0xFF, 0, (byte)0xFF, 0, (byte)0xFF, 0, (byte)0xFF};
        byte[] expected = {(byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                           (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF};
        assertArrayEquals(expected, NKPOSUtil.xor8(a, b));
    }

    @Test
    public void xor8_returnsEightBytes() {
        byte[] a = new byte[8];
        byte[] b = new byte[8];
        assertEquals(8, NKPOSUtil.xor8(a, b).length);
    }

    // ─── xor16 ──────────────────────────────────────────────────

    @Test
    public void xor16_zeroXorZero_isAllZeroHex() {
        byte[] a = new byte[16];
        byte[] b = new byte[16];
        assertEquals("00000000000000000000000000000000", NKPOSUtil.xor16(a, b));
    }

    @Test
    public void xor16_selfXor_isAllZeroHex() {
        byte[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        assertEquals("00000000000000000000000000000000", NKPOSUtil.xor16(a, a));
    }

    @Test
    public void xor16_returns32CharHexString() {
        byte[] a = new byte[16];
        byte[] b = new byte[16];
        assertEquals(32, NKPOSUtil.xor16(a, b).length());
    }

    // ─── intToByteArray ─────────────────────────────────────────

    @Test
    public void intToByteArray_zero() {
        assertArrayEquals(new byte[]{0x00, 0x00}, NKPOSUtil.intToByteArray(0));
    }

    @Test
    public void intToByteArray_one() {
        assertArrayEquals(new byte[]{0x00, 0x01}, NKPOSUtil.intToByteArray(1));
    }

    @Test
    public void intToByteArray_255() {
        assertArrayEquals(new byte[]{0x00, (byte)0xFF}, NKPOSUtil.intToByteArray(255));
    }

    @Test
    public void intToByteArray_256() {
        assertArrayEquals(new byte[]{0x01, 0x00}, NKPOSUtil.intToByteArray(256));
    }

    @Test
    public void intToByteArray_maxTwoBytes() {
        assertArrayEquals(new byte[]{(byte)0xFF, (byte)0xFF}, NKPOSUtil.intToByteArray(65535));
    }

    @Test
    public void intToByteArray_returnsExactlyTwoBytes() {
        assertEquals(2, NKPOSUtil.intToByteArray(100).length);
    }

    // ─── convertHexToString ─────────────────────────────────────

    @Test
    public void convertHexToString_hello() {
        // "Hello" = 48 65 6C 6C 6F
        assertEquals("Hello", NKPOSUtil.convertHexToString("48656C6C6F"));
    }

    @Test
    public void convertHexToString_singleChar() {
        assertEquals("A", NKPOSUtil.convertHexToString("41"));
    }

    @Test
    public void convertHexToString_digits() {
        // "123" = 31 32 33
        assertEquals("123", NKPOSUtil.convertHexToString("313233"));
    }

    // ─── checkStringAllZero ─────────────────────────────────────

    @Test
    public void checkStringAllZero_startsWithZero_returnsTrue() {
        assertTrue(NKPOSUtil.checkStringAllZero("00000000"));
    }

    @Test
    public void checkStringAllZero_nonZeroValue_returnsFalse() {
        assertFalse(NKPOSUtil.checkStringAllZero("10000000"));
    }

    @Test
    public void checkStringAllZero_allFFs_returnsFalse() {
        assertFalse(NKPOSUtil.checkStringAllZero("FFFFFFFFFFFFFFFF"));
    }

    @Test
    public void checkStringAllZero_leadingZeroPrefix_returnsTrue() {
        // Starts with "0" → returns true immediately
        assertTrue(NKPOSUtil.checkStringAllZero("0FFFFFFF"));
    }
}
