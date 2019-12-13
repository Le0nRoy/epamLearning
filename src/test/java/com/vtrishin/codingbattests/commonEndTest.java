package com.vtrishin.codingbattests;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class commonEndTest {
    @Test
    void shouldReturnTrueLastElementsAreEqual() {
        int[] testedData1 = new int[]{ 1, 2, 3 };
        int[] testedData2 = new int[]{ 7, 3 };
        boolean actual = testedClass.commonEnd( testedData1, testedData2 );
        assertTrue( actual );
    }

    @Test
    void shouldReturnFalseLastElementsAreNotEqual() {
        int[] testedData1 = new int[]{ 1, 2, 3 };
        int[] testedData2 = new int[]{ 7, 3, 2 };
        boolean actual = testedClass.commonEnd( testedData1, testedData2 );
        assertFalse( actual );
    }

    @Test
    void shouldReturnTrueTheOnlyElementsAreEqual() {
        int[] testedData1 = new int[]{ 1 };
        int[] testedData2 = new int[]{ 1 };
        boolean actual = testedClass.commonEnd( testedData1, testedData2 );
        assertTrue( actual );
    }

    @Test
    void shouldReturnFalseOneArrayIsEmpty() {
        int[] testedData1 = new int[]{};
        int[] testedData2 = new int[]{ 1 };
        boolean actual = testedClass.commonEnd( testedData1, testedData2 );
        assertFalse( actual );
    }

    @Test
    void shouldReturnFalseBothArraysAreEmpty() {
        int[] testedData1 = new int[]{};
        int[] testedData2 = new int[]{};
        boolean actual = testedClass.commonEnd( testedData1, testedData2 );
        assertFalse( actual );
    }

    @Test
    void shouldReturnFalseAtLeastOneIsNull() {
        int[] testedData1 = null;
        int[] testedData2 = new int[]{ 1, 6, 5 };
        boolean actual = testedClass.commonEnd( testedData1, testedData2 );
        assertFalse( actual );
    }

    private MyArrays testedClass = new MyArrays();

}
