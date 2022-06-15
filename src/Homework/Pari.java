package Homework;

import java.util.Scanner;

public class Pari {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = input.nextInt();

        System.out.println("Пары множителей введённого числа: ");

        for (int y=2; x>y; y++) {
            if ((x % y) == 0)
                System.out.print( y + " ");
        }
    }
}
