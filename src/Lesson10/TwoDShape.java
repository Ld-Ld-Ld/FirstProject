package Lesson10;

abstract public class TwoDShape {
      double width;
      double height;

    TwoDShape(double width, double height){
        this.width = this.height;
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

    abstract double areaCalc();
}
