package lab1;

import java.util.Scanner;

import static java.lang.Double.parseDouble;
//принадлежит ли точка области
public class Task2 {

    //задается область, границы не включаются
    static final Rectangle RECT_1 = new Rectangle(-4,5,4,0);
    static final Rectangle RECT_2 = new Rectangle(-6,0,6,-3);

    //класс прямоугольников, из которых состоит область
    public static class Rectangle {
        double x1, y1, x2, y2;

        public Rectangle (double x1, double y1, double x2, double y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }

    //проверка на попадание в область
    public static boolean belongsToArea (double x, double y){
        //в первый прямоугольник
        if (x > RECT_1.x1 && x < RECT_1.x2 && y > RECT_1.y2 && y < RECT_1.y1){
            return true;
            //во второй
        } else if (x > RECT_2.x1 && x < RECT_2.x2 && y > RECT_2.y2 && y < RECT_2.y1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main (String[] args) {
        System.out.println("Введите x:");
        double x = parseDouble(new Scanner(System.in).nextLine());
        System.out.println("Введите y:");
        double y = parseDouble(new Scanner(System.in).nextLine());

        boolean result = belongsToArea(x, y);
        System.out.println(result);
    }
}
