package lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void delElLCS() {
        int[] a = new int[] {1, 2, 3};
        int res = Task5.delElLCS(a);
        assertEquals(res, 0);

        a = new int[] {2, 1, 3};
        res = Task5.delElLCS(a);
        assertEquals(res, 1);

        a = new int[] {2, 1, 3, 6, 7, 2};
        res = Task5.delElLCS(a);
        assertEquals(res, 2);
    }
}