package com.vtrishin.codingbattests;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class sum2Test {
    @Test
    void shouldReturn5FirstTwoElements2And3() {
        int[] testedData = new int[]{ 2, 3, 8, 18, 9 };
        int actual = testedClass.sum2( testedData );
        int expected = 5;
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturn1GivenOnlyOneElementThatIs1() {
        int[] testedData = new int[]{ 1 };
        int actual = testedClass.sum2( testedData );
        int expected = 1;
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturn0GivenEmptyArray() {
        int[] testedData = new int[]{};
        int actual = testedClass.sum2( testedData );
        int expected = 0;
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturn0GivenNull() {
        int[] testedData = null;
        int actual = testedClass.sum2( testedData );
        int expected = 0;
        assertEquals( expected, actual );
    }

    @Test
    void shouldReturnMinus5FirstTwoElementsMinus8And3() {
        int[] testedData = new int[]{ -8, 3, 8, 18, 9 };
        int actual = testedClass.sum2( testedData );
        int expected = -5;
        assertEquals( expected, actual );
    }

    // сделать отдельный блок инициализации
    private MyArrays testedClass = new MyArrays();

}
