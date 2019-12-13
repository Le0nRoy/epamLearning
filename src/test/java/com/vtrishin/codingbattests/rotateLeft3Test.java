package com.vtrishin.codingbattests;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

class rotateLeft3Test {
    @Test
    void shouldReturnArrayWithElementsShiftedToLeftByOne() {
        int[] testedData = new int[]{ 1, 2, 3 };
        int[] actual = testedClass.rotateLeft3( testedData );
        int[] expected = new int[]{ 2, 3, 1 };
        assertArrayEquals( expected, actual );
    }

    @Test
    void shouldReturnEmptyArrayIfGivenEmptyArray() {
        int[] testedData = new int[]{};
        int[] actual = testedClass.rotateLeft3( testedData );
        int[] expected = new int[]{};
        assertArrayEquals( expected, actual );
    }

    @Test
    void shouldReturnEmptyArrayIfGivenNull() {
        int[] testedData = null;
        int[] actual = testedClass.rotateLeft3( testedData );
        int[] expected = new int[]{};
        assertArrayEquals( expected, actual );
    }

    @Test
    void shouldReturnSameArrayIfGivenOneElementArray() {
        int[] testedData = new int[]{ 1 };
        int[] actual = testedClass.rotateLeft3( testedData );
        int[] expected = new int[]{ 1 };
        assertArrayEquals( expected, actual );
    }

    @Test
    void shouldReturnArrayWithElementsShiftedToLeftByOneIfGivenTwoElements() {
        int[] testedData = new int[]{ 1, 2 };
        int[] actual = testedClass.rotateLeft3( testedData );
        int[] expected = new int[]{ 2, 1 };
        assertArrayEquals( expected, actual );
    }

    private MyArrays testedClass = new MyArrays();

}
