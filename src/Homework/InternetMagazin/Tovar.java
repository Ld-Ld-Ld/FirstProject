package Homework.InternetMagazin;

public class Tovar extends Category{

    int price;
    int rate;

    public void tovarPrice(int shorts,int dress,int top,int sweatshirt,int swimwear,int cardigan,int coat,int jeans,int jumper){
        System.out.println("\nHere are the prices: ");
        shorts = 12;
        dress= 41;
        top=44;
        sweatshirt= 56;
        swimwear= 106;
        cardigan=420;
        coat=20;
        jeans=76;
        jumper=3;
        System.out.println("The price for shorts is: $" + shorts +'.');
        System.out.println("The price for dress is: $" + dress  +'.');
        System.out.println("The price for top is: $" + top +'.');
        System.out.println("The price for sweatshirt is: $" + sweatshirt +'.');
        System.out.println("The price for swimwear is: $" + swimwear +'.');
        System.out.println("The price for cardigan is: $" + cardigan +'.');
        System.out.println("The price for coat is: $" + coat +'.');
        System.out.println("The price for jeans is: $" + jeans +'.');
        System.out.println("The price for jumper is: $" + jumper +'.');
    }


    public void tovarRate(int shorts,int dress,int top,int sweatshirt,int swimwear,int cardigan,int coat,int jeans,int jumper){
        System.out.println("Rating for the products: ");
        shorts=3;
        dress= 4;
        top=5;
        sweatshirt= 2;
        swimwear= 4;
        cardigan=4;
        coat=3;
        jeans=5;
        jumper=5;
        System.out.println("The rate for shorts is:  " + shorts +'.');
        System.out.println("The rate for dress is:  " + dress +'.');
        System.out.println("The rate for top is:  " + top +'.');
        System.out.println("The rate for sweatshirt is:  " + sweatshirt +'.');
        System.out.println("The rate for swimwear is:  " + swimwear +'.');
        System.out.println("The rate for cardigan is:  " + cardigan +'.');
        System.out.println("The rate for coat is:  " + coat +'.');
        System.out.println("The rate for jeans is:  " + jeans +'.');
        System.out.println("The rate for jumper is:  " + jumper +'.');

    }

}
