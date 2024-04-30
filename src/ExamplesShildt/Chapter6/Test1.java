package ExamplesShildt.Chapter6;
// Объекты передаются методам по ссылке
public class Test1 {
    int a, b;

    Test1(int i, int j) {
        a = i;
        b = j;
    }
    /* Передача объекта методу. Теперь переменные ob.a и ob.b
       объекта, используемого при вызове, также будут изменяться. */
    void change(Test1 ob){
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}

class CallByRef {
    public static void main(String[] args) {
        Test1 ob = new Test1(15, 20);

        System.out.println("ob.a и ob.b перед вызовом: " + ob.a + " " + ob.b);

        ob.change(ob);

        System.out.println("ob.a и ob.b после вызовом: " + ob.a + " " + ob.b);
    }
}
