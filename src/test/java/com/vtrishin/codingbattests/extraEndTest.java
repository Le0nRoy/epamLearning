package com.vtrishin.codingbattests;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class extraEndTest {
    @Test
    void shouldReturnStringMadeOfThreeGvenStrings() {
        String testedData = "ab";
        String actual = testedClass.extraEnd( testedData );
        String expected = "ababab";
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturnEmptyStringIfGivenEmptyString() {
        String testedData = "";
        String actual = testedClass.extraEnd( testedData );
        String expected = "";
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturnEmptyStringIfGivenNull() {
        String testedData = null;
        String actual = testedClass.extraEnd( testedData );
        String expected = "";
        assertEquals( expected, actual );
    }

    private MyStrings testedClass = new MyStrings();

}
