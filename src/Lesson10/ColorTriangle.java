package Lesson10;

public class ColorTriangle extends Triangle{
    String color;

    ColorTriangle(String color, String style, double width, double height){
       super(style, width, height);
       this.color=color;
    }
    String getColor() {
        return color;
    }
    void showColor() {
        System.out.println("Triangle ");
    }

    @Override
    double areaCalc() {
        return 0;
    }
}
