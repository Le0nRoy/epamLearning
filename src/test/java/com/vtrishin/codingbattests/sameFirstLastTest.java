package com.vtrishin.codingbattests;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class sameFirstLastTest {
    @Test
    void shouldReturnFalseFirstNotEqualsLast() {
        int[] testedData = new int[]{ 1, 2, 3 };
        boolean actual = testedClass.sameFirstLast( testedData );
        assertFalse( actual );
    }

    @Test
    void shouldReturnTrueFirstEqualsLast() {
        int[] testedData = new int[]{ 1, 2, 3, 1 };
        boolean actual = testedClass.sameFirstLast( testedData );
        assertTrue( actual );
    }

    @Test
    void shouldReturnTrueGivenOnlyZero() {
        int[] testedData = new int[]{ 0 };
        boolean actual = testedClass.sameFirstLast( testedData );
        assertTrue( actual );
    }

    @Test
    void shouldReturnFalseGivenEmptyArray() {
        int[] testedData = new int[]{};
        boolean actual = testedClass.sameFirstLast( testedData );
        assertFalse( actual );
    }

    @Test
    void shouldReturnFalseGivenNull() {
        int[] testedData = null;
        boolean actual = testedClass.sameFirstLast( testedData );
        assertFalse( actual );
    }

    private MyArrays testedClass = new MyArrays();

}
