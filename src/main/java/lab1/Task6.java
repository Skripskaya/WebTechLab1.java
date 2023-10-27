package lab1;

import java.util.Random;
//кв. матрица
public class Task6 {
    public static int[][] fillTable (int[] a) {
        int n = a.length;
        int[][] result = new int[n][n];
        for (int i =0; i < n; i++){
            for (int j = n-1; j > -1; j--){
                result[i][((j-i+n)%n)] = a[j];
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
    public static void main (String args[]) {
        int[] a = new int[5];
        fillArray(a);
        fillTable(a);
    }
}
