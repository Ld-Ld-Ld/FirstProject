package Lesson5;

import java.io.IOException;

public class Break2 {
    public static void main(String[] args) throws IOException {
        char ch;

        for (int i = 0;;) {
            System.out.println("run nr. " + i);
            ch = (char) System.in.read();
            if (ch == 'q') break;
            i++;
        }
        System.out.println("You've entered q");

//        char ch1 = (char) System.in.read();
//        char ch2 = (char) System.in.read();
//        char ch3 = (char) System.in.read();
//        char ch4 = (char) System.in.read();
//        char ch5 = (char) System.in.read();
//        System.out.println("ch1" + ch1);
//        System.out.println("ch2" + ch1);
//        System.out.println("ch3" + ch1);
//        System.out.println("ch4" + ch1);
//        System.out.println("ch5" + ch1);
    }
}
