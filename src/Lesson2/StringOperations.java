package Lesson2;

import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {

        String hi = "Hello";
        String name;

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        name = input.nextLine();

        System.out.println(hi +" "+ name);
        System.out.println("You are in " + 2022 + " year");
        System.out.println("YThe result of a sum of 2 and 3 is " + (2+3));
    }
}
