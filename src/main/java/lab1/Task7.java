package lab1;

import java.util.Random;
//сортировка
public class Task7 {
    public static double[] sortArray(double[] a) {
        int n = a.length;
        int i = 0;
        while (i < n-1) {
            if (a[i] > a[i+1]) {
                double temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                i = (i < 1) ? 0 : i - 1;
                //i--;
            } else {
                i++;
            }
        }
        return a;
    }
    public static void fillArray (double[] a) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++){
            //случайное число [-100; 100]
            a[i] = random.nextDouble(5);
        }
    }
    public static void main (String srgs[]){
        double [] a = new double[5];
        fillArray(a);
        sortArray(a);
    }
}
