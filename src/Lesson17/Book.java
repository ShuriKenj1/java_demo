package Lesson17;
import java.time.Year;
import java.util.Objects;

public class Book implements Comparable<Book>{
    private Genre genre;
    private String name;
    private String author;
    private short yearOfPublication;
    private int numOfPages;
    private String publishingHouse;
    private boolean isTranslated;

    public enum Genre {DETECTIVE, SCIENCE, FANTASY, ROMANCE, HORROR, CLASSIC, HISTORICAL}

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, String author) {
        this(name);
        this.author = author;
    }

    public Book(String name, String author, short yearOfPublication) {
        this(name, author);
        this.yearOfPublication = yearOfPublication;
    }

    public Book(String name, String author, short yearOfPublication, Genre genre) {
        this(name, author, yearOfPublication);
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public short getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(short yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public boolean isTranslated() {
        return isTranslated;
    }

    public void setTranslated(boolean translated) {
        isTranslated = translated;
    }

    public int getAge() {
        return Year.now().getValue() - yearOfPublication;
    }

    @Override
    public int compareTo(Book o) {
        if (getAge() < o.getAge()) return 1;
        else if (getAge() > o.getAge()) return -1;
        return 0;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Book book = (Book) o;
//        return getYearOfPublication() == book.getYearOfPublication() && isTranslated() == book.isTranslated() && getGenre() == book.getGenre() && Objects.equals(getName(), book.getName()) && Objects.equals(getAuthor(), book.getAuthor());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getGenre(), getName(), getAuthor(), getYearOfPublication(), isTranslated());
//    }

    @Override
    public String toString() {
        return "Book{" +
                "genre=" + genre +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", numOfPages=" + numOfPages +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", isTranslated=" + isTranslated +
                '}';
    }
}

