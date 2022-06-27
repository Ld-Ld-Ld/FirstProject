package Lesson8;

public class CallByValue {
    public static void main(String[] args) {

        Test ob = new Test(15,20);

        int a=15;
        int b=20;

        System.out.println("a&b before call: " + ob.a + " " + ob.b);
        ob.change(ob);
        ob.noChange(a,b);
        System.out.println("a&b after call: " + ob.a + " " + ob.b);
    }
}
