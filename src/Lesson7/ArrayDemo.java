package Lesson7;

public class ArrayDemo {
    public static void main(String[] args) {
        int sample[] = new int[10];
        int i;

        for (i=0; i<10; i++)  {
            sample[i]=i+30;
        }

        for (i=0; i<10; i++)  {
            System.out.println("Element [" + i + "]:" + sample[i]);
        }
    }
}
