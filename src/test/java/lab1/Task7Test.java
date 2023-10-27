package lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    void sortArray() {
        double[] a = new double[] {2.12345, 3.2, 1.5, 5.3, 4.46} ;
        double[] testArray = new double[] {1.5, 2.12345, 3.2, 4.46, 5.3} ;
        double[] res = Task7.sortArray(a);
        for (int i = 0; i < a.length; i++) {
            assertEquals(testArray[i], res[i], 0.0001);
        }
    }
}