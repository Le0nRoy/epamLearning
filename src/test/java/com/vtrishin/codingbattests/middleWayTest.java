package com.vtrishin.codingbattests;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

class middleWayTest {
    @Test
    void shouldReturnArrayWith2And5AsMiddlesOfGivenArrays() {
        int[] testedData1 = new int[]{ 1, 2, 3 };
        int[] testedData2 = new int[]{ 4, 5, 6 };
        int[] actual = testedClass.middleWay( testedData1, testedData2 );
        int[] expected = new int[]{ 2, 5 };
        assertArrayEquals( expected, actual );
    }

    @Test
    void shouldReturnEmptyArrayOneOfArraysEmpty() {
        int[] testedData1 = new int[]{};
        int[] testedData2 = new int[]{ 4, 5, 6 };
        int[] actual = testedClass.middleWay( testedData1, testedData2 );
        int[] expected = new int[]{};
        assertArrayEquals( expected, actual );
    }

    @Test
    void shouldReturnEmptyArrayOneOfArraysNull() {
        int[] testedData1 = null;
        int[] testedData2 = new int[]{ 4, 5, 6 };
        int[] actual = testedClass.middleWay( testedData1, testedData2 );
        int[] expected = new int[]{};
        assertArrayEquals( expected, actual );
    }

    @Test
    void shouldReturnConcatOfGivenArraysWithOneElement() {
        int[] testedData1 = new int[]{ 1 };
        int[] testedData2 = new int[]{ 4 };
        int[] actual = testedClass.middleWay( testedData1, testedData2 );
        int[] expected = new int[]{ 1, 4 };
        assertArrayEquals( expected, actual );
    }

    // сделать отдельный блок инициализации
    private MyArrays testedClass = new MyArrays();
}
