package com.vtrishin.codingbattests;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class makeAbbaTest {
    @Test
    void shouldReturnTwoSecondStringsBetweenTwoFirst() {
        String testedData1 = "Hi";
        String testedData2 = "Bye";
        String actual = testedClass.makeAbba( testedData1, testedData2 );
        String expected = "HiByeByeHi";
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturnDoubledOneStringIfGivenNullAnotherString() {
        String testedData1 = null;
        String testedData2 = "null";
        String actual = testedClass.makeAbba( testedData1, testedData2 );
        String expected = "";
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturnDoubledOneStringIfGivenEmptyAnotherString() {
        String testedData1 = "";
        String testedData2 = "afd";
        String actual = testedClass.makeAbba( testedData1, testedData2 );
        String expected = "afdafd";
        assertEquals( expected, actual );
    }

    @Test
    void shouldreturnEmptyStringIfBothGivenAreNull() {
        String testedData1 = null;
        String testedData2 = null;
        String actual = testedClass.makeAbba( testedData1, testedData2 );
        String expected = "";
        assertEquals( expected, actual );

    }

    private MyStrings testedClass = new MyStrings();

}
