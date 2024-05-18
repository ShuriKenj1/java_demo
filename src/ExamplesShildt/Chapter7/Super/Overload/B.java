package ExamplesShildt.Chapter7.Super.Overload;

// Создание подкласса путем расширения класса A
public class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // Перегрузить метод show()
    void show(String msg) {
        // Сигнатуры данного метода и метода show() из класса A
        // отличаются, поэтому вместо переопределения происходит
        // перегрузка метода
        System.out.println(msg + k);
    }
}
