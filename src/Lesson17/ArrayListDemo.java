package Lesson17;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<>();

        Book a = new Book("smth", "smbd", (short) 1900);
        Book b = new Book("Путешествие в Икстлан", "Карлос Кастанеда", (short) 2039);
        Book c = new Book("Plague", "Albert Kamyu", (short) 1375);
        Book d = new Book("O brave new world", "Aldous Huxley", (short) 4212);
        Book e = new Book("Procrastinating", "JoJo", (short) 1590);

        System.out.println("a.compareTo(b): " + a.compareTo(b));
        List<Book> list = Arrays.asList(a, b, c, d, e);

        library.add(b);
        library.add(b);
        library.add(c);
        System.out.println(library.get(0));
        System.out.println(library.size());
        library.remove(0);
        System.out.println(library.size());
        library.remove(c);
        System.out.println(library.size());
        System.out.println(library.contains(c));
        System.out.println(library.contains(b));
        System.out.println("Add all:");
        System.out.println(library.containsAll(list));
        library.addAll(list);
        library.addAll(4, list);
        System.out.println(library.containsAll(list));

        System.out.println(library);

        System.out.println("\nOur Library:");
        for (Book item : library) {
            System.out.println(item);
        }

        Iterator<Book> it = library.iterator();

//        while (it.hasNext()) {
//            Book i = it.next();
//            if (i.getYearOfPublication() < 1890) it.remove();
//        }

//        library.removeIf(n -> (n.getYearOfPublication() < 1890));

        Comparator<Book> nameComparator = Comparator.comparing(Book::getName);

        library.sort(nameComparator);

        Collections.sort(library);

        System.out.println("\nSorted Library:");
        for (Book item : library) {
            System.out.println(item);
        }
    }
}