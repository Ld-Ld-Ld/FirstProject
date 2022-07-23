package Package15;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, Book> library = new HashMap<>();

        Book a = new Book("walter Scott", "Ivanhoe", (short) 1900);
        Book b = new Book("Charles Dickens", "Oliver", (short) 1987);
        Book c = new Book("Arthur C", "Sherlok", (short) 1930);
        Book d = new Book("Edgar A", "Golden bug", (short) 1885);
        Book e = new Book("Lev To", "War and peace", (short) 1900);
        Book e1 = new Book("Lev To", "War and peace", (short) 1900);
        Book f = new Book("Defo", "wGulliver");

        List<Book> bunchOfBooks = Arrays.asList(e, e1, b, c, d, a);

//        library = (HashMap<Integer, Book>) convertListToMap(bunchOfBooks);

        for (int i = 0; i < bunchOfBooks.size(); i++) {
            if (library.put(i, bunchOfBooks.get(i)) != null) {
                throw new IllegalStateException("Duplicate key");
            }
        }

        System.out.println(library);

        for (Integer i : library.keySet()) {
            System.out.println(i);
        }
            for (Book i : library.values()) {
                System.out.println(i);

        }
//        public static Map<Integer, Book> convertListToMap(List<Book> bunchOfBooks){
//            Map<Integer, Book> map = new HashMap<>();
//            for (int i =0; i< bunchOfBooks.size(); i++){
//                if (map.put(i, bunchOfBooks.get(i)) !=null) {
//                    throw new IllegalStateException("duplicate key");
//                }
//            }
//        }
    }
}
