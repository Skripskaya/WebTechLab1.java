package lab1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    @Test
    void testFunction ()
    {
        ArrayList<Task3.Point> testArray = new ArrayList<>();
        testArray.add(new Task3.Point (1, 1.557407724655));
        testArray.add(new Task3.Point (1.2, 2.572151622126));
        testArray.add(new Task3.Point (1.4, 5.797883715483));
        testArray.add(new Task3.Point (1.6, -34.232532735557));
        testArray.add(new Task3.Point (1.8, -4.286261674628));
        testArray.add(new Task3.Point (2.0, -2.185039863262));

        ArrayList<Task3.Point> res = Task3.function(1, 2, 0.2);
        assertTrue (testArray.size() == res.size());
        for (int i = 0; i < res.size(); i++) {
            assertEquals(testArray.get(i).x, res.get(i).x, 0.0001 );
            assertEquals(testArray.get(i).y, res.get(i).y, 0.0001 );
        }
    }
}