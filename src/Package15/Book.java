package Package15;

import java.util.Objects;

public class Book {
    private int numPages;
    private String author;
    private String name;
    private short yearofpublication;
    private String publishinghouse;
    private boolean isTranslate;

    enum Genre {
        DETECTIVE,
        SCIENCE,
        FANTASY,
        ROMANCE,
        HORROR,
        CLASSIC,
        HISTORICAL
    }
    Book(String name){
        this.name=name;
    }
    Book(String author, String name){
         this.author=author;
        this.name=name;
    }
    Book(String author, String name, short yearofpublication){
        this.author=author;
        this.name=name;
        this.yearofpublication=yearofpublication;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getYearofpublication() {
        return yearofpublication;
    }

    public void setYearofpublication(short yearofpublication) {
        this.yearofpublication = yearofpublication;
    }

    public String getPublishinghouse() {
        return publishinghouse;
    }

    public void setPublishinghouse(String publishinghouse) {
        this.publishinghouse = publishinghouse;
    }

    public boolean isTranslate() {
        return isTranslate;
    }

    public void setTranslate(boolean translate) {
        isTranslate = translate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) && name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "numPages=" + numPages +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", yearofpublication=" + yearofpublication +
                ", publishinghouse='" + publishinghouse + '\'' +
                ", isTranslate=" + isTranslate +
                '}' + "\n";
    }
}
