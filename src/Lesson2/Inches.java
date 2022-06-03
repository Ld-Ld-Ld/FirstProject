package Lesson2;

import java.sql.SQLOutput;

public class Inches {
    public static void main (String[] args){

        long ci;
        long in;

        in = 5280 * 12;
        ci = in * in * in;

        System.out.println(" v kubiceskoi mile soderjitsea " + ci + "kubiceskig diuimov");
    }
}
