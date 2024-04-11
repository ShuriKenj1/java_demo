package Lesson13.Bookpack;

public class Book {
    protected String title;
    protected String author;
    protected int publisherDate;
    // protected виден только для потомков,
    // в каком бы package они не были бы
    // (level of accessModifiers - чуть больше чем default)

    public Book(String t, String a, int p){
        title = t;
        author = a;
        publisherDate = p;
    }

    public void show(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(publisherDate);
        System.out.println();
    }
}
