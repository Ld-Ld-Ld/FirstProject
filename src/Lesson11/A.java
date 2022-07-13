package Lesson11;

public interface A {
    void method1();
    void method2();

    default int getID(){
      return 1;
    }

}
