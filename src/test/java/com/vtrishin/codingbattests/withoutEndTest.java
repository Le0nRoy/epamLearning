package com.vtrishin.codingbattests;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class withoutEndTest {
    @Test
    void shouldReturnGivenStringWithoutFirstAndLastCharacters() {
        String testedData = "java";
        String actual = testedClass.withoutEnd( testedData );
        String expected = "av";
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturnEmptyStringIfGivenStringWithTwoElements() {
        String testedData = "ja";
        String actual = testedClass.withoutEnd( testedData );
        String expected = "";
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturnEmptyStringIfGivenStringWithOneElement() {
        String testedData = "j";
        String actual = testedClass.withoutEnd( testedData );
        String expected = "";
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturnEmptyStringIfGivenNull() {
        String testedData = null;
        String actual = testedClass.withoutEnd( testedData );
        String expected = "";
        assertEquals( expected, actual );
    }

    private MyStrings testedClass = new MyStrings();

}
