package Homework;

public class PhoneDemo {
    public static void main(String[] args) {

        Phone iPhone = new Phone(054520, "S4848", 100);
        System.out.println(iPhone);

        Phone samsung = new Phone(0575220, "L775");
        System.out.println(samsung);

        Phone nokia = new Phone();
        System.out.println(nokia);

        iPhone.receiveCall("John");
        iPhone.getNumber(054520);

        samsung.receiveCall("Lisa");
        samsung.getNumber(0575220);


        int n [] = {444475, 555110, 999665};
        Phone.sendMessage(n);
    }
}
