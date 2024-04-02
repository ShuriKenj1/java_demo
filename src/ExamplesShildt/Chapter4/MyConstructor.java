package ExamplesShildt.Chapter4;

import Lesson5.MyClass;

public class MyConstructor {
    int x;

    MyConstructor() { // конструктор класса MyConstructor
        x = 10;
    }
}

class ConstructorDemo {
    public static void main(String[] args) {
        MyConstructor t1 = new MyConstructor();
        MyConstructor t2 = new MyConstructor();

        System.out.println(t1.x + " " + t2.x);
    }
}
