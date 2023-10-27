package lab1;

import java.util.ArrayList;
//корзина с мячиками
public class Task9 {
    public static class Ball {
        private int weight;
        private String color;
        public Ball() {}
        public Ball(int weight, String color) {
            this.weight = weight;
            this.color = color;
        }

        public int getWeight() {
            return weight;
        }
        public String getColor() {
            return color;
        }
    }

    public static class Basket {
        private ArrayList<Ball> balls;
        public Basket () {
            balls = new ArrayList<>();
        }
        public void addBall(Ball ball) {
            balls.add(ball);
            return;
        }

        public int countWeight () {
            int weight = 0;
            for (Ball ball : this.balls) {
                weight += ball.weight;
            }
            return weight;
        }

        public int countColorBalls(String color){
            int count = 0;
            for (Ball ball : this.balls){
                if (ball.color == color) {
                    count++;
                }
            }
            return count;
        }
    }

    public static void main (String args[]){
        Basket basket = new Basket();
        basket.addBall(new Ball(5, "green"));
        basket.addBall(new Ball(15, "blue"));
        basket.addBall(new Ball(10, "blue"));
        for (Ball ball : basket.balls){
            System.out.println("ball, weight: " + ball.weight + " color: " + ball.color);
        }
        System.out.println("Weight of the balls in the basket:" + basket.countWeight());
        System.out.println("Amount of blue balls balls in the basket:" + basket.countColorBalls("blue"));
    }
}
