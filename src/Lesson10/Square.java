package Lesson10;

public  class Square  extends TwoDShape{

    Square(double width) {
        super(width, width);
    }

    @Override
    double areaCalc() {
        return getWidth()*getHeight();
    }
}
