package Homework;

import java.util.Random;

public class MinHW {
    public static void main(String[] args) {

    int[] arr = new int[10];
    Random rnd = new Random();

        for (int i = 0; i<10; i++) {
        arr[i] = rnd.nextInt(200);
        System.out.println("arr[" + i + "]=" + arr[i]);
    }
        System.out.println("Числа в массиве сгенерированы." );

        int min;
        min = arr[0];

        for (int num : arr) {
            if (num < min) {
                min=num;
            }
        }
        System.out.println("min is " + min );



}
}



