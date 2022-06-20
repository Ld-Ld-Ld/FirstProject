package Homework;

import java.util.Arrays;

public class LongWord {
    public static void main(String[] args) {

        String str = "Choose a job you love, and you will never have to work a day in your life.";
        String[] words = str.split(" ");
        System.out.println("The longest word is: " + maxLengthWord(words));

    }
    private static String maxLengthWord(String[] s) {
        for (int i = 0; i < s.length; i++) {
            s[i] = s[i].toLowerCase();
        }
        Arrays.sort(s);
        int len = 0;
        String longest = "";
        for (String string : s) {
            if (string.length() > len) {
                len = string.length();
                longest = string;
                 }
           }
         return longest;
    }
}
