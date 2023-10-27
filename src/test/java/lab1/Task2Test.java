package lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {


    //не включая границу области
    @Test
    void testBelongsToArea() {
        //точка точно в области
        boolean res = Task2.belongsToArea(1, 1);
        assertTrue(res);

        //точка на границе
        res = Task2.belongsToArea(-2, -3);
        assertFalse(res);

        //точка точно не области
        res = Task2.belongsToArea(-6, 1);
        assertFalse(res);
    }
}