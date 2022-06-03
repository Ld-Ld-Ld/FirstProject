package Lesson2;

public class ScopeDemo {

    public static void main (String[] args){

        int x;
        int y;

        x = 10;
        if (x == 10) {
             y = 20;
            System.out.println("x and y:" + x + " " + y);
            x = y *2;
                    }
        y = 100;
        System.out.println("x is" + x);
    }
}
