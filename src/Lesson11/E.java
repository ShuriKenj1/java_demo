package Lesson11;

public class E extends D{
    int k;

    E(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(){
        super.show();
        System.out.println("& k: " + k);
    }

    public static void main(String[] args) {
        E e = new E(1,2,3);
        e.show();
    }
}
