package com.vtrishin.codingbattests;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

class MyStringsTest {

    static class helloname {
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
    }

    static class makeAbba {
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
            String expected = "";
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
    }

    static class makeTags {
        @Test
        void shouldReturnSecondStringInsideTagWithNameFromFirstString() {
            String testedData1 = "i";
            String testedData2 = "Hello";
            String actual = testedClass.makeTags( testedData1, testedData2 );
            String expected = "<i>Hello</i>";
            assertEquals( expected, actual );
        }
//
//        @Test
//        void shouldReturnDoubledOneStringIfGivenNullAnotherString() {
//            String testedData1 = null;
//            String testedData2 = "null";
//            String actual = testedClass.makeAbba( testedData1, testedData2 );
//            String expected = "";
//            assertEquals( expected, actual );
//        }
//
//        @Test
//        void shouldReturnDoubledOneStringIfGivenEmptyAnotherString() {
//            String testedData1 = "";
//            String testedData2 = "afd";
//            String actual = testedClass.makeAbba( testedData1, testedData2 );
//            String expected = "";
//            assertEquals( expected, actual );
//        }
//
//        @Test
//        void shouldreturnEmptyStringIfBothGivenAreNull() {
//            String testedData1 = null;
//            String testedData2 = null;
//            String actual = testedClass.makeAbba( testedData1, testedData2 );
//            String expected = "";
//            assertEquals( expected, actual );
//
//        }
    }

    static MyStrings testedClass = new MyStrings();

    @Test
    void makeOutWord() {
        MyStrings testedClass = new MyStrings();
        String actual = testedClass.makeOutWord( "<<>>", "WooHoo" );
        String expected = "<<WooHoo>>";
        assertEquals( expected, actual );
        actual = testedClass.makeOutWord( "[[]]", "word" );
        expected = "[[word]]";
        assertEquals( expected, actual );
    }

    @Test
    void extraEnd() {
        MyStrings testedClass = new MyStrings();
        String actual = testedClass.extraEnd( "ab" );
        String expected = "ababab";
        assertEquals( expected, actual );
        actual = testedClass.extraEnd( "Hi" );
        expected = "HiHiHi";
        assertEquals( expected, actual );
    }

    @Test
    void firstTwo() {
        MyStrings testedClass = new MyStrings();
        String actual = testedClass.firstTwo( "ab" );
        String expected = "ab";
        assertEquals( expected, actual );
        actual = testedClass.firstTwo( "Hello" );
        expected = "He";
        assertEquals( expected, actual );
    }

    @Test
    void firstHalf() {
        MyStrings testedClass = new MyStrings();
        String actual = testedClass.firstHalf( "WooHoo" );
        String expected = "Woo";
        assertEquals( expected, actual );
        actual = testedClass.firstHalf( "HelloThere" );
        expected = "Hello";
        assertEquals( expected, actual );
    }

    @Test
    void withoutEnd() {
        MyStrings testedClass = new MyStrings();
        String actual = testedClass.withoutEnd( "java" );
        String expected = "av";
        assertEquals( expected, actual );
        actual = testedClass.withoutEnd( "coding" );
        expected = "odin";
        assertEquals( expected, actual );
    }

    @Test
    void comboString() {
        MyStrings testedClass = new MyStrings();
        String actual = testedClass.comboString( "Hello", "hi" );
        String expected = "hiHellohi";
        assertEquals( expected, actual );
        actual = testedClass.comboString( "hi", "Hello" );
        expected = "hiHellohi";
        assertEquals( expected, actual );
    }

    @Test
    void nonStart() {
        MyStrings testedClass = new MyStrings();
        String actual = testedClass.nonStart( "Hello", "There" );
        String expected = "ellohere";
        assertEquals( expected, actual );
        actual = testedClass.nonStart( "java", "code" );
        expected = "avaode";
        assertEquals( expected, actual );
    }
}