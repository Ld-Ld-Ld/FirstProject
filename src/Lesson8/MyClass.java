package Lesson8;

public class MyClass {
    private int alpha;
    public int beta;
    int gamma;

//    MyClass(int a) {
//        setAlpha(a);
//    }

      void setAlpha(int a) {

          alpha = a;
     }

     int getAlpha() {

          return alpha;
     }

    @Override
    public String toString() {
        return "MyClass{" +
                "alpha=" + alpha +
                ", beta=" + beta +
                ", gamma=" + gamma +
                '}';
    }

}
