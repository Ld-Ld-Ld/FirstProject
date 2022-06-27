package Lesson9;

public class Triangle extends TwoDShape{

    String style;

    Triangle(String style, double width, double height) {
        super(width, height);
//        setWidth(width);
//        setHeight(height);
        this.style = style;
    }
    double areaCalc() {
        return getHeight()*getWidth() /2;
    }
    void showStyle (){
        System.out.println("Triangle has style: " + style);
    }
}
