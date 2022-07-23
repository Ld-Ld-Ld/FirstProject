package Package15;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {

//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        System.out.println(numbers.size());
//
//        numbers.add(7, 8);
//        System.out.println("new size: " + numbers.size());

        LinkedList<Book> library = new LinkedList<>();

        Book a = new Book("walter Scott","Ivanhoe", (short) 1900);
        Book b = new Book("Charles Dickens","Oliver", (short) 1987);
        Book c = new Book("Arthur C","Sherlok", (short) 1930);
        Book d = new Book("Edgar A","Golden bug", (short) 1885);
        Book e = new Book("Lev To","War and peace", (short) 1900);
        Book e1 = new Book("Lev To","War and peace", (short) 1900);
        Book f = new Book("Defo", "wGulliver");

        List<Book> bunchOfBooks = Arrays.asList(e,b,c,d,a);
        library.addAll(bunchOfBooks);
        library.addFirst(e);
        library.addLast(e1);
        System.out.println("is there e1? ");
        System.out.println(library.contains(e1));
        System.out.println(library);
        library.remove(e);
        System.out.println("--------");
        System.out.println(library);

        System.out.println("2 to 4");
        System.out.println(library.subList(2, 4));

        Book[] libArr = new Book [library.size()];
        library.toArray(libArr);
        System.out.println("this is libArr");
        System.out.println(Arrays.toString(libArr));

        Comparator<Book> authorComparator = Comparator.comparing(Book::getAuthor);
        library.sort(authorComparator);

        System.out.println("after sorting");
        System.out.println(library);

    }
}
