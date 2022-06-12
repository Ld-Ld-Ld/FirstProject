package Homework;

import java.util.Scanner;

public class Pari {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = input.nextInt();


        int y = (int) Math.sqrt(x);

        System.out.println("Пары множителей:  " + y +" и " + y);


    }
}
