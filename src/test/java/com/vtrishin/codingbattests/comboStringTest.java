package com.vtrishin.codingbattests;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class comboStringTest {
    @Test
    void shouldReturnStringWithFirstGivenStringBetweenTwoSeconds() {
        String testedData1 = "Hello";
        String testedData2 = "hi";
        String actual = testedClass.comboString( testedData1, testedData2 );
        String expected = "hiHellohi";
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturnStringWithFirstGivenStringSecondIsEmpty() {
        String testedData1 = "Hello";
        String testedData2 = "";
        String actual = testedClass.comboString( testedData1, testedData2 );
        String expected = "Hello";
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturnTwoSecondStringsIfFirstIsEmpty() {
        String testedData1 = "Hello";
        String testedData2 = "";
        String actual = testedClass.comboString( testedData1, testedData2 );
        String expected = "Hello";
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturnEmptyStringIfOneOfGivenStringsIsNull() {
        String testedData1 = "Hello";
        String testedData2 = null;
        String actual = testedClass.comboString( testedData1, testedData2 );
        String expected = "";
        assertEquals( expected, actual );
    }

    private MyStrings testedClass = new MyStrings();

}
