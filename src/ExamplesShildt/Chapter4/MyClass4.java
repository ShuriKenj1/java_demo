package ExamplesShildt.Chapter4;
// Параметризированный конструктор
public class MyClass4 {
    int x;

    MyClass4(int i){
        x = i;
    }
}

class ParameterConstructorDemo {
    public static void main(String[] args) {
        MyClass4 t1 = new MyClass4(10);
        MyClass4 t2 = new MyClass4(88);

        System.out.println(t1.x + " " + t2.x);
    }
}