package lab1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
//найти тангенс, вывести х и у
public class Task3 {

    public static class Point {
        double x, y;
        public Point (double x, double y){
            this.x = x;
            this.y = y;
        }

        public String show() {
            String res = String.format("%.2f | %.2f", x, y);
            return (res);
        }

    }

    public static ArrayList<Point> function (double a, double b, double h) {
        ArrayList<Point> result = new ArrayList<>();
        for (double x = a; x < b + 0.0001; x +=h) {
            double y = Math.tan(x); //в радианах
            result.add(new Point (x, y));
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("lab1.Task3");
        double a, b, h;
        System.out.println("Введите a:");
        a = parseDouble(new Scanner(System.in).nextLine());
        System.out.println("Введите b:");
        b = parseDouble(new Scanner(System.in).nextLine());
        System.out.println("Введите h:");
        h = parseDouble(new Scanner(System.in).nextLine());
        ArrayList<Point> func = function(a, b, h);
        for (Point point: func) {
            System.out.println(point.show());
        }
    }
}
