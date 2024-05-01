package ExamplesShildt.Chapter6;
// Демонстрация перегрузки конструкторов
public class MyClassOverloadCons {
    int x;

    MyClassOverloadCons(){
        System.out.println("Внутри MyClass().");
        x = 0;
    }

    MyClassOverloadCons(int i){
        System.out.println("Внутри MyClass(int i).");
        x = i;
    }

    MyClassOverloadCons(double d) {
        System.out.println("Внутри MyClass(double d).");
    }

    MyClassOverloadCons(int i, int j){
        System.out.println("Внутри MyClass(int i, int j).");
        x = i * j;
    }
}

class OverloadConsDemo {
    public static void main(String[] args) {
        MyClassOverloadCons t1 = new MyClassOverloadCons();
        MyClassOverloadCons t2 = new MyClassOverloadCons(88);
        MyClassOverloadCons t3 = new MyClassOverloadCons(17.23);
        MyClassOverloadCons t4 = new MyClassOverloadCons(2,4);

        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }
}
