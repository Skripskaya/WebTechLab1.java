package lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {
    @Test
    void task9Test() {
        Task9.Basket basket = new Task9.Basket();
        basket.addBall(new Task9.Ball(5, "green"));
        basket.addBall(new Task9.Ball(15, "blue"));
        basket.addBall(new Task9.Ball(10, "blue"));
        int resWeight = basket.countWeight();
        assertEquals(30, resWeight);
        int resColor = basket.countColorBalls("blue");
        assertEquals(2, resColor);

        basket.addBall(new Task9.Ball(100, "red"));
        resWeight = basket.countWeight();
        assertEquals(130, resWeight);
        resColor = basket.countColorBalls("blue");
        assertEquals(2, resColor);

        basket.addBall(new Task9.Ball(10, "blue"));
        resWeight = basket.countWeight();
        assertEquals(140, resWeight);
        resColor = basket.countColorBalls("blue");
        assertEquals(3, resColor);
    }
}