package Lesson15;

public interface MyInterface {
    int myMethod1(); // обычный

    default void myMethod2(){ System.out.println("Default method body of MyInterface"); }

    static void myMethod3(){ System.out.println("Static method body of MyInterface"); }

    default int myMethod4(int a, int b){ return a + b; }

    static void myMethod5(InterfaceImplementation a){
        a.myMethod1();
    }
}