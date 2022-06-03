package Lesson2;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args){

        Scanner mylittleScanner = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.println("Enter first integer: ");
        number1 = mylittleScanner.nextInt();

        System.out.println("Enter second integer: ");
        number2 = mylittleScanner.nextInt();

        sum = number1 + number2;
        System.out.println(sum);
        System.out.printf("Sum is: %d", sum);
    }
}
