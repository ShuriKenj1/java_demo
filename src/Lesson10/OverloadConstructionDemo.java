package Lesson10;

public class OverloadConstructionDemo {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass(88);
        MyClass obj3 = new MyClass(88.26);
        MyClass obj4 = new MyClass(84,6);

        System.out.println("obj1.x = " + obj1.x);
        System.out.println("obj2.x = " + obj2.x);
        System.out.println("obj3.x = " + obj3.x);
        System.out.println("obj4.x = " + obj4.x);
    }
}
