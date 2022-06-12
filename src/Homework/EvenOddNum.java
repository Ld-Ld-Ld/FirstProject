package Homework;

import java.util.Scanner;

public class EvenOddNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int x = input.nextInt();

        if (x % 2 == 0) {
        System.out.println("Четное");
            }
        else {
        System.out.println("Не четное");

        }
    }
}
