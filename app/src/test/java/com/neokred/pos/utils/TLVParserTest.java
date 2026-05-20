package com.neokred.pos.utils;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TLVParserTest {

    // Minimal TLV: tag=9F02 (2-byte), length=06, value=000000001111
    // 9F 02 06 00 00 00 00 11 11
    private static final String SIMPLE_TLV = "9F0206000000001111";

    // Real-world multi-tag TLV from a swipe transaction
    private static final String MULTI_TAG_TLV =
            "9F0606A000000333010" +
            "15F24032412319F1601" +
            "079F21031142259A031" +
            "808039F020600000000" +
            "11119F0306000000000" +
            "0009F34034203009F12" +
            "0A50424F432044454249" +
            "549F0607A000000333010" +
            "15F300202209F4E0F616" +
            "2636400000000000000000000";

    // TLV with tag C4 (masked PAN field used in payment flow)
    // C4 0A 621067FFFFFFFFF047 — 10 bytes value
    private static final String TLV_WITH_C4 =
            "C40A621067FFFFFFFFF047";

    @Before
    public void setUp() {
        // TLVParser uses a static list — ensure clean state before each test
    }

    // ─── parse() ────────────────────────────────────────────────

    @Test
    public void parse_validSimpleTlv_returnsNonEmptyList() {
        List<TLV> result = TLVParser.parse(SIMPLE_TLV);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void parse_validSimpleTlv_tagMatches() {
        List<TLV> result = TLVParser.parse(SIMPLE_TLV);
        assertNotNull(result);
        // 9F02 is the Transaction Amount tag
        TLV found = TLVParser.searchTLV(result, "9f02");
        assertNotNull("Tag 9F02 should be found", found);
    }

    @Test
    public void parse_validSimpleTlv_valueMatches() {
        List<TLV> result = TLVParser.parse(SIMPLE_TLV);
        assertNotNull(result);
        TLV found = TLVParser.searchTLV(result, "9f02");
        assertNotNull(found);
        assertEquals("000000001111", found.value);
    }

    @Test
    public void parse_nullInput_returnsNullOrEmpty() {
        List<TLV> result = TLVParser.parse(null);
        assertTrue(result == null || result.isEmpty());
    }

    @Test
    public void parse_emptyString_returnsNullOrEmpty() {
        List<TLV> result = TLVParser.parse("");
        assertTrue(result == null || result.isEmpty());
    }

    @Test
    public void parse_invalidHex_doesNotCrash() {
        List<TLV> result = TLVParser.parse("ZZZZZZZZ");
        // Should not throw — either null or partial result
        // The important thing is no crash
    }

    @Test
    public void parse_oddLengthHex_doesNotCrash() {
        // hexToByteArray handles only even-length strings
        List<TLV> result = TLVParser.parse("9F");
        // Either null or an error — should not crash
    }

    // ─── searchTLV() ────────────────────────────────────────────

    @Test
    public void searchTLV_tagFound_returnsCorrectTlv() {
        List<TLV> result = TLVParser.parse(SIMPLE_TLV);
        assertNotNull(result);
        TLV found = TLVParser.searchTLV(result, "9f02");
        assertNotNull(found);
        assertEquals("9f02", found.tag);
    }

    @Test
    public void searchTLV_caseInsensitive_uppercase() {
        List<TLV> result = TLVParser.parse(SIMPLE_TLV);
        assertNotNull(result);
        TLV found = TLVParser.searchTLV(result, "9F02");
        assertNotNull("Search should be case-insensitive", found);
    }

    @Test
    public void searchTLV_tagNotFound_returnsNull() {
        List<TLV> result = TLVParser.parse(SIMPLE_TLV);
        assertNotNull(result);
        TLV found = TLVParser.searchTLV(result, "FFFF");
        assertNull("Non-existent tag should return null", found);
    }

    @Test
    public void searchTLV_emptyList_returnsNull() {
        TLV found = TLVParser.searchTLV(new java.util.ArrayList<>(), "9F02");
        assertNull(found);
    }

    // ─── hexToByteArray() ───────────────────────────────────────

    @Test
    public void hexToByteArray_valid_returnsCorrectBytes() {
        byte[] result = TLVParser.hexToByteArray("AABB");
        assertArrayEquals(new byte[]{(byte)0xAA, (byte)0xBB}, result);
    }

    @Test
    public void hexToByteArray_allZeros() {
        byte[] result = TLVParser.hexToByteArray("0000");
        assertArrayEquals(new byte[]{0x00, 0x00}, result);
    }

    @Test
    public void hexToByteArray_singleByte() {
        byte[] result = TLVParser.hexToByteArray("FF");
        assertArrayEquals(new byte[]{(byte)0xFF}, result);
    }

    // ─── toHexString() ──────────────────────────────────────────

    @Test
    public void toHexString_allZeros() {
        assertEquals("0000", TLVParser.toHexString(new byte[]{0, 0}));
    }

    @Test
    public void toHexString_knownBytes() {
        assertEquals("deadbeef", TLVParser.toHexString(
                new byte[]{(byte)0xDE, (byte)0xAD, (byte)0xBE, (byte)0xEF}));
    }

    @Test
    public void toHexString_emptyArray() {
        assertEquals("", TLVParser.toHexString(new byte[]{}));
    }

    // ─── VerifyTLV() ────────────────────────────────────────────

    @Test
    public void verifyTLV_startsWith9F06_returnsTrue() {
        assertTrue(TLVParser.VerifyTLV("9F06" + "07A0000000031010"));
    }

    @Test
    public void verifyTLV_startsWith00_returnsFalse() {
        assertFalse(TLVParser.VerifyTLV("00AABBCC"));
    }

    @Test
    public void verifyTLV_validSimpleTlv_returnsTrue() {
        assertTrue(TLVParser.VerifyTLV(SIMPLE_TLV));
    }

    // ─── parse() — multiple tags ─────────────────────────────────

    @Test
    public void parse_multipleTags_allFoundBySearch() {
        // Two back-to-back primitive TLVs:
        // Tag 81 (single-byte), length 01, value AA
        // Tag 82 (single-byte), length 01, value BB
        String twoTags = "8101AA8201BB";
        List<TLV> result = TLVParser.parse(twoTags);
        assertNotNull(result);
        assertTrue("Should have at least 2 entries", result.size() >= 2);
        TLV t1 = TLVParser.searchTLV(result, "81");
        TLV t2 = TLVParser.searchTLV(result, "82");
        assertNotNull("Tag 81 not found", t1);
        assertNotNull("Tag 82 not found", t2);
        assertEquals("aa", t1.value);
        assertEquals("bb", t2.value);
    }

    @Test
    public void parse_c4Tag_maskedPanTag() {
        // C4 0A + 10 bytes of value
        String tlv = "C40A621067FFFFFFFFF047AA";
        List<TLV> result = TLVParser.parse(tlv);
        assertNotNull(result);
        TLV pan = TLVParser.searchTLV(result, "c4");
        assertNotNull("Tag C4 (masked PAN) should be found", pan);
        assertEquals("c4", pan.tag);
    }
}
