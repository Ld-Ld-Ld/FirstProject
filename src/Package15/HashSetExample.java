package Package15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet <Book> library = new HashSet<>();

        Book a = new Book("walter Scott","Ivanhoe", (short) 1900);
        Book b = new Book("Charles Dickens","Oliver", (short) 1987);
        Book c = new Book("Arthur C","Sherlok", (short) 1930);
        Book d = new Book("Edgar A","Golden bug", (short) 1885);
        Book e = new Book("Lev To","War and peace", (short) 1900);
        Book e1 = new Book("Lev To","War and peace", (short) 1900);
        Book f = new Book("Defo", "wGulliver");

        List<Book> bunchOfBooks = Arrays.asList(e,b,c,d,a);
        library.addAll(bunchOfBooks);
        System.out.println(library);


    }
}
