import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArraysTest {

    @Test
    void firstLast6() {
        MyArrays testedClass = new MyArrays();
        boolean actual = testedClass.firstLast6(new int[] {1, 2, 6});
        assertTrue(actual);
        actual = testedClass.firstLast6(new int[] {6, 1, 2, 3});
        assertTrue(actual);
        actual = testedClass.firstLast6(new int[] {13, 6, 1, 2, 3});
        assertFalse(actual);
    }

    @Test
    void sameFirstLast() {
        MyArrays testedClass = new MyArrays();
        boolean actual = testedClass.sameFirstLast(new int[] {1, 2, 3});
        assertFalse(actual);
        actual = testedClass.sameFirstLast(new int[] {1, 2, 3, 1});
        assertTrue(actual);
        actual = testedClass.sameFirstLast(new int[] {1, 2, 1});
        assertTrue(actual);
    }

    @Test
    void makePi() {
        MyArrays testedClass = new MyArrays();
        int[] actual = testedClass.makePi();
        int[] expected = new int[] {3, 1, 4};
        assertArrayEquals(expected, actual);
    }

    @Test
    void commonEnd() {
        MyArrays testedClass = new MyArrays();
        boolean actual = testedClass.commonEnd(new int[] {1, 2, 3}, new int[] {7, 3});
        assertTrue(actual);
        actual = testedClass.commonEnd(new int[] {1, 2, 3}, new int[] {7, 3, 2});
        assertFalse(actual);
        actual = testedClass.commonEnd(new int[] {1, 2, 3}, new int[] {1, 3});
        assertTrue(actual);
    }

    @Test
    void sum3() {
        MyArrays testedClass = new MyArrays();
        int actual = testedClass.sum3(new int[] {1, 2, 3});
        int expected = 6;
        assertEquals(expected, actual);
        actual = testedClass.sum3(new int[] {5, 11, 2});
        expected = 18;
        assertEquals(expected, actual);
        actual = testedClass.sum3(new int[] {7, 0, 0});
        expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    void rotateLeft3() {
        MyArrays testedClass = new MyArrays();
        int[] actual = testedClass.rotateLeft3(new int[] {1, 2, 3});
        int[] expected = new int[] {2, 3, 1};
        assertArrayEquals(expected, actual);
        actual = testedClass.rotateLeft3(new int[] {5, 11, 9});
        expected = new int[] {11, 9, 5};
        assertArrayEquals(expected, actual);
        actual = testedClass.rotateLeft3(new int[] {7, 0, 0});
        expected = new int[] {0, 0, 7};
        assertArrayEquals(expected, actual);
    }

    @Test
    void reverse3() {
        MyArrays testedClass = new MyArrays();
        int[] actual = testedClass.reverse3(new int[] {1, 2, 3});
        int[] expected = new int[] {3, 2, 1};
        assertArrayEquals(expected, actual);
        actual = testedClass.reverse3(new int[] {5, 11, 9});
        expected = new int[] {9, 11, 5};
        assertArrayEquals(expected, actual);
        actual = testedClass.reverse3(new int[] {7, 0, 0});
        expected = new int[] {0, 0, 7};
        assertArrayEquals(expected, actual);
    }

    @Test
    void maxEnd3() {
        MyArrays testedClass = new MyArrays();
        int[] actual = testedClass.maxEnd3(new int[] {1, 2, 3});
        int[] expected = new int[] {3, 3, 3};
        assertArrayEquals(expected, actual);
        actual = testedClass.maxEnd3(new int[] {5, 11, 9});
        expected = new int[] {11, 11, 11};
        assertArrayEquals(expected, actual);
        actual = testedClass.maxEnd3(new int[] {15, 8, 4});
        expected = new int[] {15, 15, 15};
        assertArrayEquals(expected, actual);
    }

    @Test
    void sum2() {
        MyArrays testedClass = new MyArrays();
        int actual = testedClass.sum2(new int[] {1, 2, 3});
        int expected = 3;
        assertEquals(expected, actual);
        actual = testedClass.sum2(new int[] {1, 1});
        expected = 2;
        assertEquals(expected, actual);
        actual = testedClass.sum2(new int[] {1, 1, 1, 1});
        expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void middleWay() {
        MyArrays testedClass = new MyArrays();
        int[] actual = testedClass.middleWay(new int[] {1, 2, 3}, new int[] {4, 5, 6});
        int[] expected = new int[] {2, 5};
        assertArrayEquals(expected, actual);
        actual = testedClass.middleWay(new int[] {7, 7, 7}, new int[] {3, 8, 0});
        expected = new int[] {7, 8};
        assertArrayEquals(expected, actual);
        actual = testedClass.middleWay(new int[] {5, 2, 9}, new int[] {1, 4, 5});
        expected = new int[] {2, 4};
        assertArrayEquals(expected, actual);
    }
}