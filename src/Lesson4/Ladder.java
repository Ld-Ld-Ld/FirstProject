package Lesson4;

public class Ladder {
    public static void main(String[] args) {
        int x;

        for (x = 0; x<6; x++) {
            if (x==1)
                System.out.println("х равно еденице");
            else if (x==2)  System.out.println("х равно двум");
            else if (x==3)  System.out.println("х равно трем");
            else if (x==4)  System.out.println("х равно четырем");
            else System.out.println("значение вне диапозона 1-4");

        }

    }
}
