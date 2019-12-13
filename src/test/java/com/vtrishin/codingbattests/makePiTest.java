package com.vtrishin.codingbattests;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

class makePiTest {
    @Test
    void shouldReturnArrayWithFirstThreeCyphersOfPi() {
        int[] actual = testedClass.makePi();
        int[] expected = new int[]{ 3, 1, 4 };
        assertArrayEquals( expected, actual );
    }

    private MyArrays testedClass = new MyArrays();

}
