package com.vtrishin.codingbattests;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

class reverse3Test {
    @Test
    void shouldReturnReversedArrayIfGivenTwoOrMoreElements() {
        int[] testedData = new int[]{ 1, 2, 3 };
        int[] actual = testedClass.reverse3( testedData );
        int[] expected = new int[]{ 3, 2, 1 };
        assertArrayEquals( expected, actual );
    }

    @Test
    void shouldReturnEmptyArrayIfGivenEmptyArray() {
        int[] testedData = new int[]{};
        int[] actual = testedClass.reverse3( testedData );
        int[] expected = new int[]{};
        assertArrayEquals( expected, actual );
    }

    @Test
    void shouldReturnEmptyArrayIfGivenNull() {
        int[] testedData = null;
        int[] actual = testedClass.reverse3( testedData );
        int[] expected = new int[]{};
        assertArrayEquals( expected, actual );
    }

    @Test
    void shouldReturnSameArrayIfGivenOneElementArray() {
        int[] testedData = new int[]{ 1 };
        int[] actual = testedClass.reverse3( testedData );
        int[] expected = new int[]{ 1 };
        assertArrayEquals( expected, actual );
    }

    private MyArrays testedClass = new MyArrays();

}
