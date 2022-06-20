package Homework;

public class BackwardArr {
    public static void main(String[] args) {

        int a[] = {20, 4, 50, 80, 83, 57, 2};

        System.out.print("Элементы массива: ");

        for (int i = 0; i < 7; i++) {
             System.out.print( a[i] + " ");
        }
        System.out.println();

        System.out.print("Элементы в обратном порядке: ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
