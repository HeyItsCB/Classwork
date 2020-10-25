/**
 * RomanToDecimalTest is a class that tests the RomanToDecimal method,
 * feeding various inputs into the class and testing if their outputs
 * match predictions given in the program.
 * @version 10/7/2020
 * @author Chris Burkhard
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToDecimalTest {

    @Test
    /**
     * Tests whether the RomanToDecimal method returns expected output when
     * given a variety of inputs.
     */
    public void romanToDecimalTest() {
        assertEquals(RomanToDecimal.romanToDecimal("MDCLXVI"), 1666);
        assertEquals(RomanToDecimal.romanToDecimal("IXIXIX"), 27);
        assertEquals(RomanToDecimal.romanToDecimal("XXXXX"), 50);
        /*
        assertEquals(RomanToDecimal.romanToDecimal("iIiIiIi"), 7);
        This returns -1, not 7, because the string is converted to upper case in main only
         */
        assertEquals(RomanToDecimal.romanToDecimal(""), 0);
        assertEquals(RomanToDecimal.romanToDecimal("LIL"), 101);
        assertEquals(RomanToDecimal.romanToDecimal("LOL"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("six"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("CMCDXCXLIXIV"), 1443);
        assertEquals(RomanToDecimal.romanToDecimal("IC"), 101);
        assertEquals(RomanToDecimal.romanToDecimal("CI"), 101);
        assertEquals(RomanToDecimal.romanToDecimal("CII"), 102);
        assertEquals(RomanToDecimal.romanToDecimal("CIII"), 103);
        assertEquals(RomanToDecimal.romanToDecimal("CIV"), 104);
        assertEquals(RomanToDecimal.romanToDecimal("CV"), 105);
        assertEquals(RomanToDecimal.romanToDecimal("CVI"), 106);
        assertEquals(RomanToDecimal.romanToDecimal("MILD"), 1551);
        assertEquals(RomanToDecimal.romanToDecimal("LIVID"), 555);
        //I initially got this wrong because I forgot about IV so I wrote 557
        assertEquals(RomanToDecimal.romanToDecimal("DIVIL"), 555);
        assertEquals(RomanToDecimal.romanToDecimal("MDCCCXLVII"), 1847);
        assertEquals(RomanToDecimal.romanToDecimal("Okay_Boomer"), -1);

        assertNotEquals(RomanToDecimal.romanToDecimal("hello world!"), 0);
        assertNotEquals(RomanToDecimal.romanToDecimal("CMCM"), 2000);
        assertNotEquals(RomanToDecimal.romanToDecimal("IM"), 999);
        assertNotEquals(RomanToDecimal.romanToDecimal("IL"), 49);
        assertNotEquals(RomanToDecimal.romanToDecimal("1000"), 1000);
        assertNotEquals(RomanToDecimal.romanToDecimal("This_is_an_easter_egg"), 0);
        assertNotEquals(RomanToDecimal.romanToDecimal("VIII This_is_an_easter_egg"), 8);
        assertNotEquals(RomanToDecimal.romanToDecimal("This is an easter egg"), 0);
        assertNotEquals(RomanToDecimal.romanToDecimal("CXILDMICXLIMDLICMXLIMMMCCCX"), -1);
        assertNotEquals(RomanToDecimal.romanToDecimal("IIIIII1IIIIII"), 13);
    }
}