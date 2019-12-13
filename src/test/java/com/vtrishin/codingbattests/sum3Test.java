package com.vtrishin.codingbattests;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class sum3Test {
    @Test
    void shouldReturnSixAsSumOfElemnts() {
        int[] testedData = new int[]{ 1, 2, 3 };
        int actual = testedClass.sum3( testedData );
        int expected = 6;
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturnSameElementIfItIsOnlyInArray() {
        int[] testedData = new int[]{ 1 };
        int actual = testedClass.sum3( testedData );
        int expected = 1;
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturnZeroIfGivenEmptyArray() {
        int[] testedData = new int[]{};
        int actual = testedClass.sum3( testedData );
        int expected = 0;
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturnZeroIfGivenNull() {
        int[] testedData = null;
        int actual = testedClass.sum3( testedData );
        int expected = 0;
        assertEquals( expected, actual );
    }

    private MyArrays testedClass = new MyArrays();

}
