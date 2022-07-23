package Package16;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;

        iOb = new Gen<Integer>(88);

        iOb.showType();

        int v = iOb.getOb();
        System.out.println("value of v: " +v);

        Gen<String> strOb=new Gen<String>("message testing");

        strOb.showType();

        String str = strOb.getOb();
        System.out.println("value of str: " + str);

       TwoGen<Integer, String> tgOb = new TwoGen<>(88,"Generics");
       tgOb.showTypes();

       int v1=tgOb.getOb1();
       String v2=tgOb.getOb2();
        System.out.println("value of v1: "+ v1);
        System.out.println("value of v2: "+ v2);

    }
}
