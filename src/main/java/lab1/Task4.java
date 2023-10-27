package lab1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
//номера простых элементов массива
public class Task4 {
    public static boolean isPrimal(int x) {
        if (x <= 1) {
            return false;
        }
        if (x == 2) {
            return true;
        }
        for (int i = 2; i < Math.sqrt(x)+1; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    public static ArrayList<Integer> findPrimals (int[] x) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < x.length; i ++) {
            if (isPrimal(x[i])) {
                result.add(i);
            }
        }
        return result;
    }

    public static void fillArray (int[] a) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++){
            //случайное число [-100; 100]
            a[i] = random.nextInt(201) - 100;
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите размер массива N:");
        int n = Integer.parseInt( new Scanner(System.in).nextLine());
        int[] a = new int[n];
        fillArray(a);
        for (int i: a){
            System.out.print(i + " ");
        }

        ArrayList<Integer> primals = findPrimals(a);
        System.out.println();
        for(Integer i: primals){
            System.out.print(i.toString() + " ");
        }
    }
}
