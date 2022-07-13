package Lesson10;

public class Rectangle extends TwoDShape{
    public Rectangle(double width, double height) {
        super(width, height);
    }

    @Override
    double areaCalc() {
        return 0;
    }
    boolean isSquare(){
        if (getWidth()==getHeight()) return true;
        return false;

//        return ((getWidth()==getHeight())? true:false;
    }
}
