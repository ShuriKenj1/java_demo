package Lesson17;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Book> library = new LinkedList<>();
        LimitedLinkedList<Book> limitedLibrary = new LimitedLinkedList<>(7);

        Book a = new Book("smth", "smbd", (short) 1900);
        Book b = new Book("Путешествие в Икстлан", "Карлос Кастанеда", (short) 2039);
        Book c = new Book("Plague", "Albert Kamyu", (short) 1375);
        Book d = new Book("O brave new world", "Aldous Huxley", (short) 4212);
        Book e = new Book("Procrastinating", "JoJo", (short) 1590);
        Book f = new Book("unknown", "unknown", (short) 1234);
        Book g = new Book("unknown");

        List<Book> list = Arrays.asList(a, b, c, d, e, f, g);
        library.addAll(list);
        limitedLibrary.addAll(list);

        Iterator<Book> it = library.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        library.removeFirstOccurrence(f);
        library.removeLastOccurrence(f);
        library.removeFirst();
        library.removeLast();

        System.out.println("\nAfter removal:");

        for (Book item : library) {
            System.out.println(item);
        }

        System.out.println(limitedLibrary.offerFirst(a));
        System.out.println(limitedLibrary);
    }
}
