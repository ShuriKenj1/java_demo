package Lesson11;

public class Demo {
    public static void main(String[] args) {
        B subObject = new B(1,2);
        subObject.showDetails();
        System.out.println("Order of constructors is called:");
        C c = new C();

        X x = new X(10);
        X x2;

        Y y = new Y(8,4);
        Y y2;

        x2 = x;
        x2 = y;
//        y2 = x; - нельзя так сделать, потому что класс Y РАСШИРЯЕТ класс X
//                  в нем может быть больше функций.
    }
}
