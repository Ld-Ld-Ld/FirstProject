package Package16;

import Lesson13.Berry;

public class Gen <T>{
    T ob;

    Gen(T o){
        ob=o;
    }

    T getOb(){
        return ob ;
    }
    void showType(){
        System.out.println("type T is " +ob.getClass().getName());
    }
}
