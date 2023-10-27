package lab1;

import java.util.Scanner;

import static java.lang.Double.doubleToLongBits;
import static java.lang.Double.parseDouble;
//найти значение функции
public class Task1 {

    //в радианах
    public static double function (double x, double y) {
        return (1 + Math.pow(Math.sin(x+y), 2))/(2 + Math.abs(x-(2*x)/(1+Math.pow(x,2)*Math.pow(y,2)))) + x;
    }

    public static void main(String[] args) {
        double x, y;

        System.out.println("Введите x:");
        x = parseDouble(new Scanner(System.in).nextLine());
        System.out.println("Введите y:");
        y = parseDouble(new Scanner(System.in).nextLine());

        double result = function (x, y);
        System.out.println(result);
    }
}
