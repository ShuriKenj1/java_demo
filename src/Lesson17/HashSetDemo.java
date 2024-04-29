package Lesson17;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Book> librarySet = new HashSet<>();
        List<Book> libraryList = new ArrayList<>();

        Book a = new Book("smth", "smbd", (short) 1900);
        Book a1 = new Book("smth", "smbd", (short) 1900);
        Book b = new Book("Путешествие в Икстлан", "Карлос Кастанеда", (short) 2039);
        Book c = new Book("Plague", "Albert Kamyu", (short) 1375);
        Book d = new Book("O brave new world", "Aldous Huxley", (short) 4212);
        Book e = new Book("Procrastinating", "JoJo", (short) 1590);
        Book e1 = new Book("unknown", 275); // здесь он добавляет и e1 и e2,
                                                            // потому что у них разное имя
                                                            // (это прописано в методах equals() и hashCode()) в классе Book, строка 108-119
        Book e2 = new Book("unknown1", 275);
        Book e3 = new Book("unknown", 275); // здесь он добавляет только его, потому что считает за дубликат e4
                                                            // из-за одинаового имени
        Book e4 = new Book("unknown", 314);

        List<Book> list = Arrays.asList(a, a1, b, b, c, d, e, e1, e2, e3, e4);

        librarySet.addAll(list);
        libraryList.addAll(list);

        System.out.println("\nLibrarySet:");
        for (Book myBook : librarySet) {
            System.out.println(myBook);
        }

        System.out.println("\nLibraryList:");
        for (Book myBook : libraryList) {
            System.out.println(myBook);
        }
    }
}
