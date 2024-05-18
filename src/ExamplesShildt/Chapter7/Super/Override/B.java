package ExamplesShildt.Chapter7.Super.Override;
// Создание подкласса путем расширения класса A
public class B extends A{
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // Отображение переменной k
    void show() {
        super.show(); // использовать ключевое слово super для вызова
                    // версии метода show(), определенной в суперклассе A
        System.out.println("k: " + k);
    }
}
