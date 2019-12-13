package com.vtrishin.codingbattests;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class helloNameTest {
    @Test
    void shouldReturnGivenStringWithHelloBefore() {
        String testedData = "Bob";
        String actual = testedClass.helloName( testedData );
        String expected = "Hello Bob!";
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturnEmptyStringIfGivenNull() {
        String testedData = null;
        String actual = testedClass.helloName( testedData );
        String expected = "";
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturnEmptyStringIfGivenEmptyString() {
        String testedData = "";
        String actual = testedClass.helloName( testedData );
        String expected = "";
        assertEquals( expected, actual );
    }

    private MyStrings testedClass = new MyStrings();

}
