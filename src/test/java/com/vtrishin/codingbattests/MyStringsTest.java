package com.vtrishin.codingbattests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStringsTest {

    @Test
    void helloName ( ) {
        MyStrings testedClass = new MyStrings ();
        String actual = testedClass.helloName("Bob");
        String expected = "Hello Bob!";
        assertEquals ( expected, actual );
        actual = testedClass.helloName("Alice");
        expected = "Hello Alice!";
        assertEquals ( expected, actual );
    }

    @Test
    void makeAbba ( ) {
        MyStrings testedClass = new MyStrings ();
        String actual = testedClass.makeAbba("Hi", "Bye");
        String expected = "HiByeByeHi";
        assertEquals ( expected, actual );
        actual = testedClass.makeAbba("Yo", "Alice");
        expected = "YoAliceAliceYo";
        assertEquals ( expected, actual );
    }

    @Test
    void makeTags ( ) {
        MyStrings testedClass = new MyStrings ();
        String actual = testedClass.makeTags("i", "Hello");
        String expected = "<i>Hello</i>";
        assertEquals ( expected, actual );
        actual = testedClass.makeTags("cite", "Yay");
        expected = "<cite>Yay</cite>";
        assertEquals ( expected, actual );
    }

    @Test
    void makeOutWord ( ) {
        MyStrings testedClass = new MyStrings ();
        String actual = testedClass.makeOutWord("<<>>", "WooHoo");
        String expected = "<<WooHoo>>";
        assertEquals ( expected, actual );
        actual = testedClass.makeOutWord("[[]]", "word");
        expected = "[[word]]";
        assertEquals ( expected, actual );
    }

    @Test
    void extraEnd ( ) {
        MyStrings testedClass = new MyStrings ();
        String actual = testedClass.extraEnd("ab");
        String expected = "ababab";
        assertEquals ( expected, actual );
        actual = testedClass.extraEnd("Hi");
        expected = "HiHiHi";
        assertEquals ( expected, actual );
    }

    @Test
    void firstTwo ( ) {
        MyStrings testedClass = new MyStrings ();
        String actual = testedClass.firstTwo("ab");
        String expected = "ab";
        assertEquals ( expected, actual );
        actual = testedClass.firstTwo("Hello");
        expected = "He";
        assertEquals ( expected, actual );
    }

    @Test
    void firstHalf ( ) {
        MyStrings testedClass = new MyStrings ();
        String actual = testedClass.firstHalf("WooHoo");
        String expected = "Woo";
        assertEquals ( expected, actual );
        actual = testedClass.firstHalf("HelloThere");
        expected = "Hello";
        assertEquals ( expected, actual );
    }

    @Test
    void withoutEnd ( ) {
        MyStrings testedClass = new MyStrings ();
        String actual = testedClass.withoutEnd("java");
        String expected = "av";
        assertEquals ( expected, actual );
        actual = testedClass.withoutEnd("coding");
        expected = "odin";
        assertEquals ( expected, actual );
    }

    @Test
    void comboString ( ) {
        MyStrings testedClass = new MyStrings ();
        String actual = testedClass.comboString("Hello", "hi");
        String expected = "hiHellohi";
        assertEquals ( expected, actual );
        actual = testedClass.comboString("hi", "Hello");
        expected = "hiHellohi";
        assertEquals ( expected, actual );
    }

    @Test
    void nonStart ( ) {
        MyStrings testedClass = new MyStrings ();
        String actual = testedClass.nonStart("Hello", "There");
        String expected = "ellohere";
        assertEquals ( expected, actual );
        actual = testedClass.nonStart("java", "code");
        expected = "avaode";
        assertEquals ( expected, actual );
    }
}