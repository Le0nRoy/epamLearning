package com.vtrishin.codingbattests;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class firstTwoTest {
    @Test
    void shouldReturnStringWithFirstTwoCharactersOfGivenString() {
        String testedData = "abba";
        String actual = testedClass.firstTwo( testedData );
        String expected = "ab";
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturnGivenStringIfGivenTwoCharacters() {
        String testedData = "ab";
        String actual = testedClass.firstTwo( testedData );
        String expected = "ab";
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturnGivenStringIfGivenOneCharacters() {
        String testedData = "a";
        String actual = testedClass.firstTwo( testedData );
        String expected = "a";
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturnEmptyStringIfGivenNull() {
        String testedData = null;
        String actual = testedClass.firstTwo( testedData );
        String expected = "";
        assertEquals( expected, actual );
    }

    private MyStrings testedClass = new MyStrings();

}
