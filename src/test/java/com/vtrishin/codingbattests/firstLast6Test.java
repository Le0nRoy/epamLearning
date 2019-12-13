package com.vtrishin.codingbattests;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class firstLast6Test {
    @Test
    void shouldReturnTrueLastIsSix() {
        int[] testedData = new int[]{ 1, 2, 6 };
        boolean actual = testedClass.firstLast6( testedData );
        assertTrue( actual );
    }

    @Test
    void shouldReturnTrueFirstIsSix() {
        int[] testedData = new int[]{ 6, 1, 2, 3 };
        boolean actual = testedClass.firstLast6( testedData );
        assertTrue( actual );
    }

    @Test
    void shouldReturnTrueFirstAndLastAreSix() {
        int[] testedData = new int[]{ 6, 6 };
        boolean actual = testedClass.firstLast6( testedData );
        assertTrue( actual );
    }

    @Test
    void shouldReturnFalseNotFirstNorLastAreSix() {
        int[] testedData = new int[]{ 13, 6, 1, 2, 3 };
        boolean actual = testedClass.firstLast6( testedData );
        assertFalse( actual );
    }

    @Test
    void shouldReturnFalseIfGivenNull() {
        int[] testedData = null;
        boolean actual = testedClass.firstLast6( testedData );
        assertFalse( actual );
    }

    private MyArrays testedClass = new MyArrays();

}
