package Package15;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


public class PriorityQueueExample {
    public static void main(String[] args) {

        Queue<Book> library = new PriorityQueue();

        Book a = new Book("walter Scott","Ivanhoe", (short) 1900);
        Book b = new Book("Charles Dickens","Oliver", (short) 1987);
        Book c = new Book("Arthur C","Sherlok", (short) 1930);
        Book d = new Book("Edgar A","Golden bug", (short) 1885);
        Book e = new Book("Lev To","War and peace", (short) 1900);
        Book e1 = new Book("Lev To","War and peace", (short) 1900);
        Book f = new Book("Defo", "wGulliver");

        List<Book> bunchOfBooks = Arrays.asList(e,b,c,d,a);
        library.add(a);
        library.add(b);
        library.add(c);
        library.add(d);
        library.add(e);
        library.add(f);
        System.out.println("this is a peek: ");
        System.out.println(library.peek());
        System.out.println("this is a poll: ");
        System.out.println(library.poll());
        System.out.println(library.remove());



//        library.addAll(bunchOfBooks);

        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(3);
        numbers.add(2);
        System.out.println("priorityQueue: " + numbers);

        Integer a1=2;
        Integer a2=4;

        System.out.println("compare to: ");
        System.out.println(a1.compareTo(a2));

    }
}
