package Homework;

public class ReduceHW {
    public static void main(String[] args) {

        int array [] = {4, 1, 6, 50, 12, 66, 34, 2, 5, 34};

        System.out.print("Исходные элементы массива: ");

        for (int i = 0; i < 10; i++)
            System.out.print( array[i] + " " );
        System.out.println();

        System.out.print("Уменьшенные элементы массива на 25%: ");
        for (int i = 0; i < 10; i++) {
             double result = array[i]*0.75;
              System.out.print(result + " ");
        }

    }
    }

