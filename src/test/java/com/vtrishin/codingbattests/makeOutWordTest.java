package com.vtrishin.codingbattests;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class makeOutWordTest {
    @Test
    void shouldReturnSecondStringInsertedInTheMiddleOfFirst() {
        String testedData1 = "<<>>";
        String testedData2 = "WooHoo";
        String actual = testedClass.makeOutWord( testedData1, testedData2 );
        String expected = "<<WooHoo>>";
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturnGivenStringIfAnotherIsEmpty() {
        String testedData1 = "";
        String testedData2 = "WooHoo";
        String actual = testedClass.makeOutWord( testedData1, testedData2 );
        String expected = "WooHoo";
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturnGivenStringIfAnotherIsNull() {
        String testedData1 = null;
        String testedData2 = "WooHoo";
        String actual = testedClass.makeOutWord( testedData1, testedData2 );
        String expected = "WooHoo";
        assertEquals( expected, actual );
    }

    private MyStrings testedClass = new MyStrings();

}
