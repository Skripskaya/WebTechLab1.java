package lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    void fillTable() {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int [][] testTable = new int[][]
                {{1, 2, 3, 4, 5},
                 {2,3,4,5,1},
                 {3,4,5,1,2},
                 {4,5,1,2,3},
                 {5,1,2,3,4}};
        int[][] res = Task6.fillTable(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                assertEquals(testTable[i][j], res[i][j]);
            }
        }
    }
}