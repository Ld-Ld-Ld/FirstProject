package Lesson5;

import java.io.IOException;

public class Guess4 {
    public static void main(String[] args) throws IOException {
        char ch, ignore, answer = 'S';

        do {
            System.out.println("Задумана буква из диапозона A-Z");
            System.out.print("Угадывайте.");
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == answer) System.out.println("правильно!");
            else {
                System.out.println("нужная буква находится");
                if (ch<answer) System.out.println("концу алфавита");
                else  System.out.println("началу алфавита");
                System.out.println("попробуйте еще раз");
            }
        } while (answer != ch);
    }
}
