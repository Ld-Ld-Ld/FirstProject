package Lesson7;

public class MinMax {
    public static void main(String[] args) {
        int num[] = new int[10];

        int min, max;

        num[0] = 99;
        num[1] = 1;
        num[2] = 120;
        num[3] = 25;
        num[4] = 47;
        num[5] = 59;
        num[6] = 20;
        num[7] = -8;
        num[8] = 37;
        num[9] = 88;

        int num2[] = {1, 2, -56, 0, 8, 4, 2, 78, 32, 25};

        min = max = num2[0];
        for (int i=1; i<10; i++) {
            if (num[i] < min) min = num2[i];
            if (num[i] > max) max = num2[i];
        }
        System.out.println("min & max are " + min + " " + max);
    }
}
