package Lesson5;

import org.w3c.dom.ls.LSOutput;

public class Break3 {
    public static void main(String[] args) {

    for (int i=0; i < 3; i++)

    {
        System.out.println("outer loop counter " + i);
        System.out.println("inner loop counter ");
        int t = 0;
        while (t < 100) {
            if (t == 10) break;
            System.out.println(t + " ");
            t++;
        }
        System.out.println();
    }
        System.out.println("loops are completed");
}
}