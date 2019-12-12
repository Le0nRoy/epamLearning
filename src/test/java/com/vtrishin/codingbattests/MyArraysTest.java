package com.vtrishin.codingbattests;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

class MyArraysTest {

    static class firstLast6 {
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
    }

    static class sameFirstLast {
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
    }

    static class makePi {
        @Test
        void shouldReturnArrayWithFirstThreeCyphersOfPi() {
            int[] actual = testedClass.makePi();
            int[] expected = new int[]{ 3, 1, 4 };
            assertArrayEquals( expected, actual );
        }
    }

    static class commonEnd {
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
            assertTrue( actual );
        }

        @Test
        void shouldReturnFalseBothArraysAreEmpty() {
            int[] testedData1 = new int[]{};
            int[] testedData2 = new int[]{};
            boolean actual = testedClass.commonEnd( testedData1, testedData2 );
            assertTrue( actual );
        }
    }

    static class sum3 {
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
    }

    static class rotateLeft3 {
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

        @Test
        void shouldReturnArrayWithElementsShiftedToLeftByOneIfGivenTwoElements() {
            int[] testedData = new int[]{ 1, 2 };
            int[] actual = testedClass.rotateLeft3( testedData );
            int[] expected = new int[]{ 2, 3 };
            assertArrayEquals( expected, actual );
        }
    }

    static class reverse3 {
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
        void shouldReturnSameArrayIfGivenOneElementArray() {
            int[] testedData = new int[]{ 1 };
            int[] actual = testedClass.reverse3( testedData );
            int[] expected = new int[]{ 1 };
            assertArrayEquals( expected, actual );
        }
    }

    static class maxEnd3 {
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
        void shouldReturnSameArrayIfGivenOneElementArray() {
            int[] testedData = new int[]{ 3 };
            int[] actual = testedClass.maxEnd3( testedData );
            int[] expected = new int[]{ 3 };
            assertArrayEquals( expected, actual );
        }
    }

    static class sum2 {
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
        void shouldReturnMinus5FirstTwoElementsMinus8And3() {
            int[] testedData = new int[]{ -8, 3, 8, 18, 9 };
            int actual = testedClass.sum2( testedData );
            int expected = -5;
            assertEquals( expected, actual );
        }
    }

    static class middleWay {
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
        void shouldReturnConcatOfGivenArraysWithOneElement() {
            int[] testedData1 = new int[]{ 1 };
            int[] testedData2 = new int[]{ 4 };
            int[] actual = testedClass.middleWay( testedData1, testedData2 );
            int[] expected = new int[]{ 1, 4 };
            assertArrayEquals( expected, actual );
        }
    }

    // сделать отдельный блок инициализации
    static private MyArrays testedClass = new MyArrays();
}