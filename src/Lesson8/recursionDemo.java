package Lesson8;

public class recursionDemo {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("Let's use recursion to calculate factorial");
        System.out.println("factorial 3 is equal to" +f.calculateFactorial(3));
        System.out.println("factorial 4 is equal to" +f.calculateFactorial(4));
        System.out.println("factorial 4 is equal to" +f.calculateFactorial(5));
    }
}
