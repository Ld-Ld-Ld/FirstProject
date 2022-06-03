package Lesson2;

import java.util.Scanner;

public class Comparation {
    public static void main (String[] args){

            Scanner mylittleScanner = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.println("Enter first integer: ");
        number1 = mylittleScanner.nextInt();

         System.out.println("Enter second integer: ");
    number2 = mylittleScanner.nextInt();

    if (number1 == number2)
     System.out.printf ("%d == %d%n", number1, number2);

    if (number1 != number2)
            System.out.printf ("%d != %d%n", number1, number2);

    if (number1 ==number2)
            System.out.printf ("%d < %d%n", number1, number2);
}
}