package Lesson9;

public class ShapesApp {
    public static void main(String[] args) {
        Triangle t1= new Triangle("colored", 4.0, 4.0);
        Triangle t2= new Triangle("contour", 8.0, 12.0);
        TwoDShape t3 = new TwoDShape(3,4);

        t1.setWidth(4.0);
        t1.setHeight(4.0);
        t1.style = "colored";

        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.style = "contour";

        System.out.println("t1 info: " );
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is equal to " + t1.areaCalc());

        System.out.println("t2 info: " );
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is equal to " + t2.areaCalc());
    }
}
