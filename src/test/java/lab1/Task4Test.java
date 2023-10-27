package lab1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void isPrimal() {
        int a = -10;
        boolean res = Task4.isPrimal(a);
        assertFalse(res);

        a = 1;
        res  = Task4.isPrimal(a);
        assertFalse(res);

        a = 2;
        res = Task4.isPrimal(a);
        assertTrue(res);

        a = 7;
        res = Task4.isPrimal(a);
        assertTrue(res);


    }
    @Test
    void findPrimals() {
        int[] a = new int[] {2,3,4,-2,0};
        ArrayList<Integer> testArray = new ArrayList<Integer>();
        testArray.add(0);
        testArray.add(1);

        ArrayList<Integer> res = Task4.findPrimals(a);
        assertTrue(testArray.size() == res.size());
        for (int i = 0; i < res.size(); i++) {
            assertEquals(testArray.get(i), res.get(i));
        }
    }
}