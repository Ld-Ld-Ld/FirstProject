package packageSeparate;

import Lesson11.Book;

public class UseBook {
    public static void main(String[] args) {
        Book books[] = new Book[5];
        books[0] = new Book("story of my life", "london", 1930);
        books[1] = new Book("story of my war", "london", 1950);
        books[2] = new Book("story of my peace", "london", 1920);
        books[3] = new Book("story of my Finn", "london", 1970);
        books[4] = new Book("Java", "london", 1960);

        for (Book book: books) book.show();
    }
}
