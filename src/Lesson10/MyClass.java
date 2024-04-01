package Lesson10;

public class MyClass {
    int x;
    MyClass(){
        System.out.println("Inside of constructor MyClass().");
        x = 0;
    }

    MyClass(int x){
        System.out.println("Inside of constructor MyClass(int i).");
        this.x = x;
    }

    MyClass(double d){
        System.out.println("Inside of constructor MyClass(double d).");
        x = (int) d;
    }

    MyClass(int i, int j){
        System.out.println("Inside of constructor MyClass(int i, int j).");
        x = i * j;
    }
}
