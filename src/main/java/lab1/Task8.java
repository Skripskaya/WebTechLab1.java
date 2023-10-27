package lab1;

import java.util.Random;
//возрастающая последовательность
public class Task8 {
    public static void fillArray (int[] a) {
        Random random = new Random();
        int b = 0;
        for (int i = 0; i < a.length; i++){
            //случайное число [-100; 100]
            a[i] = random.nextInt(10) + b;
            b = a[i];
        }
    }

    //вставлять ПЕРЕД i элементом
    //если элемент больше последнего в последовательности то позиция n+1
    public static int[] posArray (int[] a, int[] b){
        int[] n = new int[b.length];
        int j = 0; //т. к. последовательность неубывающая к предыдущему элементу не возвращается
        for (int i = 0; i < b.length; i++) {
            while (n[i] == 0) {
                if (b[i] < a[j]) {
                    n[i] = j + 1 ;  //набор чисел нумеруется с 1
                } else {
                    if (j >= a.length - 1) {
                        n[i] = a.length + 1;
                    } else {
                        j++;
                    }
                }
            }
        }
        return n;
    }


    public static void main (String srs[]) {
        int[] a = new int[5];
        int[] b = new int[5];

        fillArray(a);
        fillArray(b);

        int [] n = new int[5];
        n = posArray(a, b);
    }
}
