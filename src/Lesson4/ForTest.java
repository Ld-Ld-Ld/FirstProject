package Lesson4;

import java.io.IOException;

public class ForTest {
    public static void main(String[] args) throws IOException {
        int x;
        System.out.println("для остановки нажмите [S]");
        for(x = 0; (char)System.in.read()!='S'; x++) {
            System.out.println("Проход № " + x);
        }
    }
}
