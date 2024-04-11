package Lesson13.Bookpack;

public class BookDemo {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book("Java: A Beginner's Guide", "Shildt", 2014);
        books[1] = new Book("Java: The Complete Edition", "Pepega", 2001);
        books[2] = new Book("1984", "Orwell", 1947);
        books[3] = new Book("The Art of Love", "Fromm", 1933);
        books[4] = new Book("Troublemaker", "F.O.O.L", 2022);

        for (Book book : books) {
            book.show();
            book.title = " ";
        }
        
        AccessModifierDemonstrator obj = new AccessModifierDemonstrator();
        obj.c = 1;
    }
}
