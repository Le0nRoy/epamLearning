package com.vtrishin.codingbattests;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

class maxEnd3Test {
    @Test
    void shouldReturnArrayFilledBy3() {
        int[] testedData = new int[]{ 1, 2, 3 };
        int[] actual = testedClass.maxEnd3( testedData );
        int[] expected = new int[]{ 3, 3, 3 };
        assertArrayEquals( expected, actual );
    }

    @Test
    void shouldReturnEmptyArrayIfGivenEmptyArray() {
        int[] testedData = new int[]{};
        int[] actual = testedClass.maxEnd3( testedData );
        int[] expected = new int[]{};
        assertArrayEquals( expected, actual );
    }

    @Test
    void shouldReturnEmptyArrayIfGivenNull() {
        int[] testedData = null;
        int[] actual = testedClass.maxEnd3( testedData );
        int[] expected = new int[]{};
        assertArrayEquals( expected, actual );
    }

    @Test
    void shouldReturnSameArrayIfGivenOneElementArray() {
        int[] testedData = new int[]{ 3 };
        int[] actual = testedClass.maxEnd3( testedData );
        int[] expected = new int[]{ 3 };
        assertArrayEquals( expected, actual );
    }

    private MyArrays testedClass = new MyArrays();

}
