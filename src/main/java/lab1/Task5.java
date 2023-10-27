package lab1;

import java.util.Scanner;

public class Task5 {
    //longest common subsequence
    public static int delElLCS (int[] a) {
        int result = 0;
        int n = a.length;
        int[] d = new int[n];
        for (int i = 0; i < n; i++){
            d[i] = 1;
            for (int j = 0; j < i; j++){
                if ((a[j] < a[i]) && (d[j]+1 > d[i]) ) {
                    d[i] = d[j] + 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            result = Math.max(result, d[i]);
        }
        return (n - result);
    }

    public static void main (String[] args) {
        System.out.println("Введите размер массива N");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt( scanner.nextLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }
        System.out.println(delElLCS(a));
    }
}
