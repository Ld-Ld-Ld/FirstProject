package Lesson13;

import java.util.Scanner;

public class StoreApp {
    public static void main(String[] args) throws BerryException{

       Strawberry s1 = new Strawberry();
       Strawberry s2 = new Strawberry();
       Strawberry s3 = new Strawberry(true, 8);
       Strawberry s4 = new Strawberry();
       Cranberry c1 = new Cranberry();
       Blueberry b1 = new Blueberry();

       s1.setRipe(true);
       s1.setSweetness(5);
       System.out.println(s1);

       StoreApp helper = new StoreApp();
       helper.setSweetnessToAFruit(s2, 5.9);

       try{
          s2.setSweetness(5);
       } catch (BerryException bEx) {
          System.out.println("probably a berryexception has occured.");

       }

       s2.setSweetness(5);
       System.out.println(s2);
       System.out.println(s3);
//       System.out.println(s4);
//       System.out.println(c1);
//       System.out.println(b1);
    }
    void  setSweetnessToAFruit(Strawberry obj, double sLevel){
       try{
          obj.setSweetness(sLevel);
       } catch (BerryException bEx) {
          System.out.println("probably a berryexception has occured. try again: ");
          Scanner in = new Scanner(System.in);
          double nextTry = in.nextDouble();
          setSweetnessToAFruit(obj, nextTry);

       }
    }
}
