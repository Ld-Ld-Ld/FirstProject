package Lesson10;

public class BSecond extends ASecond{

    int k;
    BSecond(int a, int b, int c){
        super(a,b);
        k=c;
    }
    void show() {
        System.out.println("k: " + k);
    }

}
