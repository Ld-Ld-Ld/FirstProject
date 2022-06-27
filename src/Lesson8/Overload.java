package Lesson8;

public class Overload {
    void ovlDemo() {
        System.out.println("no parameters");
    }
    void ovlDemo(int a) {
        System.out.println("one parameter: " +a);
    }
    void ovlDemo(int a, int b) {
        System.out.println("two parameters: "+ a + " " + b);
    }
    void ovlDemo(double a, double b) {
        System.out.println("two parameters of type double: "+ a + " " + b);
    }

    int ovlDemo(float a) {
        System.out.println("one parameter: "+ a );
        return (int)a;
    }
}
