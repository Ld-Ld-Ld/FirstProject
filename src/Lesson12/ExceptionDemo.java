package Lesson12;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int nums[]= new int[4];
        System.out.println("enter index");

        Scanner in = new Scanner(System.in);
        int userInput = in.nextInt();

        try{
            System.out.println("before generating exception ");
        nums[5] = 10;
            System.out.println("this should not be printed");
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("you are out of the bound of the array");
        }
        System.out.println("after catch");
    }
}
