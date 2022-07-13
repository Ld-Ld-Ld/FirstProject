package Lesson11;

public class SeriesDemo {
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();

        for (int i = 0; i<5; i++){
            System.out.println("next value " + ob.getNext());
        }
        System.out.println("\nReset: ");
        ob.reset();
        for (int i = 0; i<5; i++){
            System.out.println("next value " + ob.getNext());
        }
        System.out.println("\nVlue to start from: ");
        ob.setStart(100);
        for (int i = 0; i<5; i++){
            System.out.println("next value " + ob.getNext());
        }
    }
}
