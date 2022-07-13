package Lesson10;

public abstract class Triangle extends TwoDShape {

    String style;

    Triangle() {
        super(4, 8);
        this.style = "none";
    }

    Triangle(double x) {
        super(x, 4);
        this.style = "colored";
    }

    Triangle(String style, double width, double height) {
        super(width, height);
        this.style = style;

//        double areaCalc() {
//            return getHeight() * getWidth() / 2;
//        }
//        void showStyle() {
//            System.out.println("Triangle has style: " + style);
//        }
    }
}
