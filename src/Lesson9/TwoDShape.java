package Lesson9;

public class TwoDShape {
    private double width;
    private double height;

    TwoDShape(double width, double height){
        setWidth(width);
        setHeight(height);
    }

    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }

    void setWidth(double width) {
        this.width = width;
    }
    void setHeight (double height) {
        this.height = height;
    }

    void showDim () {
        System.out.println("width and height: " + width +" and " + height);
    }
}
