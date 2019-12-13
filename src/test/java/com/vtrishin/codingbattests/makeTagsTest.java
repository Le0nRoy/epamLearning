package com.vtrishin.codingbattests;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class makeTagsTest {
    @Test
    void shouldReturnSecondStringInsideTagWithNameFromFirstString() {
        String testedData1 = "i";
        String testedData2 = "Hello";
        String actual = testedClass.makeTags( testedData1, testedData2 );
        String expected = "<i>Hello</i>";
        assertEquals( expected, actual );
    }

        @Test
        void shouldReturnSecondStringInsideEmptyTagIfGivenFirstNull() {
            String testedData1 = null;
            String testedData2 = "null";
            String actual = testedClass.makeTags( testedData1, testedData2 );
            String expected = "<>null</>";
            assertEquals( expected, actual );
        }

        @Test
        void shouldReturnSecondStringInsideEmptyTagIfGivenEmptyFirstString() {
            String testedData1 = "";
            String testedData2 = "afd";
            String actual = testedClass.makeTags( testedData1, testedData2 );
            String expected = "<>afd</>";
            assertEquals( expected, actual );
        }

        @Test
        void shouldreturnEmptyStringIfBothGivenAreNull() {
            String testedData1 = null;
            String testedData2 = null;
            String actual = testedClass.makeTags( testedData1, testedData2 );
            String expected = "";
            assertEquals( expected, actual );

        }

    private MyStrings testedClass = new MyStrings();

}
