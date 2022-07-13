package Lesson10;

public class TrianglesApp {
    public static void main(String[] args) {
        ColorTriangle t1=new ColorTriangle("Blue", "contoured", 8.0, 12.0);
        ColorTriangle t2=new ColorTriangle ("red", "colored", 2.0, 2.0);

        System.out.println("reference on t1: ");
//        t1.showStyle();
        t1.showDim();

    }
}
