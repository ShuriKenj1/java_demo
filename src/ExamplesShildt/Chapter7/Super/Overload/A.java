package ExamplesShildt.Chapter7.Super.Overload;
//Переопределение метода
public class A {
    int i, j;
    A(int a, int b){
        i = a;
        j = b;
    }

    // Отобразить переменные i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}
