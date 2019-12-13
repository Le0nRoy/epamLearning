package com.vtrishin.codingbattests;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

class firstHalfTest {
    @Test
    void shouldReturnStringWithFirstHalfOfGivenString() {
        String testedData = "WooHoo";
        String actual = testedClass.firstHalf( testedData );
        String expected = "Woo";
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturnEmptyStringIfGivenStringWithOneCharacter() {
        String testedData = "W";
        String actual = testedClass.firstHalf( testedData );
        String expected = "";
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturnEmptyStringIfGivenNull() {
        String testedData = null;
        String actual = testedClass.firstHalf( testedData );
        String expected = "";
        assertEquals( expected, actual );
    }

    private MyStrings testedClass = new MyStrings();

}
