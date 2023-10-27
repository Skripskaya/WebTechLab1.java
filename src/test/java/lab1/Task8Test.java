package lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {

    @Test
    void posArray() {
        int[] a = new int[] {1, 5, 10, 15, 20};
        int[] b = new int[] {1, 3, 7, 8, 21};
        int[] testArray = new int[] {2,2,3,3,6};
        int[] res = Task8.posArray(a, b);
        assertArrayEquals(testArray, res);
    }
}