package Homework;

import java.io.IOException;

public class ChooseLanguage {
    public static void main(String[] args) throws IOException {

        char choice;

        System.out.println("1. English");
        System.out.println("2. Русский");
        System.out.println("3. Romana");
        System.out.println("4. Deutsch");


        choice = (char) System.in.read();
        System.out.println();

        switch (choice) {
            case '1':
                System.out.println("Welcome!");
                break;
            case '2':
                System.out.println("Добро пожаловать!");
                break;
            case '3':
                System.out.println("Bine ati venit!");
                break;
            case '4':
                System.out.println("Willkommen zurück!");
                break;
        }
    }
}
