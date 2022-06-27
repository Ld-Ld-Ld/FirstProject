package Homework;

import java.io.IOException;

public class HelpClassDemo {
    public static void main(String[] args) throws IOException {

        char choice, ignore;

        Help ob = new Help();

        for (; ; ) {
            do {
                ob.showMenu();
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                }
                while (ignore != '\n');
            }
                while (!ob.isValid(choice)) ;
                if (choice == 'q') break;
                System.out.println("\n");
                ob.helpOn(choice);
            }
        }
    }




