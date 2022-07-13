package Homework.InternetMagazin;

public class Category {
    public static void main(String[] args) {

        String name;
        String[] nameProducts = {"Shorts","Dress","Top","Sweatshirt","Swimwear","Cardigan","Coat","Jeans","Jumper"};

        System.out.println("List of available items: ");
        for (String i : nameProducts) {
            System.out.print(i+" ");
        }

        System.out.println();

        Tovar obj1 = new Tovar();
        obj1.tovarPrice(12,41,44,56,106,420,20,76,3);
        System.out.println();
        obj1.tovarRate(3,4,5,2,4,4,3,5,5);



        Basket obj2 = new Basket();
        obj2.purchasedProd(5,2,7,0,1,15,20,38,10);

        User obj3 = new User();
        obj3.login();
        obj3.password();


    }
}
