package Lesson12;

import Lesson13.Bookpack.Book;

public class ExtBook extends Book {
    public ExtBook(String t, String a, int p){
        super(t, a ,p);
        System.out.println(super.title);
    }

}
