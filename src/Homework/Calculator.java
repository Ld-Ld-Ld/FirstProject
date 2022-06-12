package Homework;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int x, y, sum;
        double avg;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        x = input.nextInt();

        System.out.println("Введите первое число: ");
        y = input.nextInt();

        sum = x + y;
        System.out.println("Сумма чисел равна: " + sum);

        avg = (double)(x+y) / 2;
        System.out.println("Среднее значение: " + avg);

        if (x > y)
        System.out.println(x + "  больше " + y);
        if (x < y)
        System.out.println(x + "  меньше " + y);
        else
        System.out.println(x + "  равно " + y);

    }
}
