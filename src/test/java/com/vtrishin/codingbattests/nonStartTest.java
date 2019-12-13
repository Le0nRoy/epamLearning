package com.vtrishin.codingbattests;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class nonStartTest {
    @Test
    void shouldDeleteFirstLettersInEachStringAndReturnConcatOfResults() {
        String testedData1 = "Hello";
        String testedData2 = "There";
        String actual = testedClass.nonStart( testedData1, testedData2 );
        String expected = "ellohere";
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturnEmptyStringGiven2StringWithOneElement() {
        String testedData1 = "H";
        String testedData2 = "T";
        String actual = testedClass.nonStart( testedData1, testedData2 );
        String expected = "";
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturnEmptyStringGivenOneNullString() {
        String testedData1 = null;
        String testedData2 = "Test";
        String actual = testedClass.nonStart( testedData1, testedData2 );
        String expected = "";
        assertEquals( expected, actual );
    }

    private MyStrings testedClass = new MyStrings();

}
