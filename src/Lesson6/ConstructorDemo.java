package Lesson6;

public class ConstructorDemo {
    public static void main(String[] args) {

        Apple example1 = new Apple("red");
        Apple example2 = new Apple("yellow");

        System.out.println(example1.color + " " + example2.color);
    }
}
