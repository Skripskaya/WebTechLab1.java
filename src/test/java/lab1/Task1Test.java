package lab1;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    //в радианах, с точностью до 0.01
    @org.junit.jupiter.api.Test
    void testFunction() {
        double func = Task1.function(1, 1);
        assertEquals(1.9134, func, 0.01);

        func = Task1.function(20, 50);
        assertEquals(20.0727, func, 0.01);
    }
}