package Package15;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<>();

        Book a = new Book("walter Scott","Ivanhoe", (short) 1900);
        Book b = new Book("Charles Dickens","Oliver", (short) 1987);
        Book c = new Book("Arthur C","Sherlok", (short) 1930);
        Book d = new Book("Edgar A","Golden bug", (short) 1885);
        Book e = new Book("Lev To","War and peace", (short) 1900);
        Book e1 = new Book("Lev To","War and peace", (short) 1900);
        Book f = new Book("Defo", "wGulliver");

        List<Book> list = Arrays.asList(b,c,d,e,f);



        library.add(b);
        library.addAll(list);
        System.out.println("what is on the 1 place in the library i8ndex 0 : " + library.get(0));
        System.out.println("what is the size of the libr "+ library.size());
        library.remove(0);
        library.remove(b);


        System.out.println("does library contains object a of type book?" + library.contains(a));
        System.out.println("does library contains object list of type list?" + library.containsAll(list));
        System.out.println("what is the size of the libr?" + library.size());

        System.out.println("before sorting ");
        System.out.println(library);

        Comparator <Book> authorComparator = Comparator.comparing(Book::getAuthor);
        library.sort(authorComparator);

        System.out.println("after sorting");
        System.out.println(library);

        System.out.println(e.equals(e1));

        Iterator<Book> it = library.iterator();

        while (it.hasNext()){
            it.next().setNumPages(100);

        }
//        while (it1.hasNext()){
//            System.out.println(it1.next());
//        }
//        while (it2.hasNext()){
//            Book i= it2.next();
//            if (i.getNumPages() <10) {
//                it.remove();
//            }
//        }
        System.out.println();
    }
}
