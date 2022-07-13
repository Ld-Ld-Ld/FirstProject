package Lesson12;

public class QDemo {
    public static void main(String[] args) {

        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);

        char ch;
        int i;

        System.out.println("using queue to keep the alphabet");
        for (i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        System.out.println("what contains bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.println(ch);
        }
        System.out.println("\n");

        System.out.println("using smallQ to get an error ");
        for (i = 0; i < 5; i++) {
            System.out.println("trying to save " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println("what contains bigQ ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) System.out.println(ch);
        }
    }
}
