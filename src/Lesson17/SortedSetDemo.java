package Lesson17;

import java.util.*;

public class SortedSetDemo {
    public static void main(String[] args) {
        Book a = new Book("smth", "smbd", (short) 1900);
        Book b = new Book("Путешествие в Икстлан", "Карлос Кастанеда", (short) 2039);
        Book c = new Book("Plague", "Albert Kamyu", (short) 1375);
        Book d = new Book("O brave new world", "Aldous Huxley", (short) 4212);
        Book e = new Book("Procrastinating", "JoJo", (short) 1590);

        List<Book> list = Arrays.asList(b, b, c, d, e);

        Comparator<Book> nameComparator = Comparator.comparing(Book::getName);

        SortedSet<Book> library = new TreeSet<>(nameComparator);
        library.addAll(list);

        Iterator<Book> it = library.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
