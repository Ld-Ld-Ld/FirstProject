package Lesson4;

import java.awt.image.ImagingOpException;
import java.io.IOException;

public class Guess {
    public static void main(String[] args) throws IOException {

        char ch, answer = 'S';
        System.out.println("задумана буква из диапазона A-Z.");
        System.out.println("попытаетесь её угадать.");

        ch = (char) System.in.read();

        if (ch == answer) System.out.println("Правильно");
        else System.out.println("К сожалению вы не угадали.");

    }

}
