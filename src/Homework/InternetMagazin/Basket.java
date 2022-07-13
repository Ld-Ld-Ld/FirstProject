package Homework.InternetMagazin;

public class Basket extends Category{

    String [] PurchProd = {"shorts", "dress", "top", "swimwear", "cardigan", "coat", "jeans", "jumper"};

    public void purchasedProd(int shorts,int dress,int top,int sweatshirt,int swimwear,int cardigan,int coat,int jeans,int jumper) {
        System.out.println("\nQuantity of purchased items: ");
        shorts=0;
        dress=2;
        top=0;
        sweatshirt=0;
        swimwear=0;
        cardigan=0;
        coat=1;
        jeans=0;
        jumper=1;
        System.out.println("Shorts purchased " + shorts +" times.");
        System.out.println("Dress purchased " + dress +" times.");
        System.out.println("Top purchased " + top +" times.");
        System.out.println("Sweatshirt purchased " + sweatshirt +" times.");
        System.out.println("Swimwear purchased " + swimwear +" times.");
        System.out.println("Cardigan purchased " + cardigan +" times.");
        System.out.println("Coat purchased " + coat +" times.");
        System.out.println("Jeans purchased " + jeans +" times.");
        System.out.println("Jumper purchased " + jumper +" times.");
    }

}
