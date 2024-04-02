package ExamplesShildt.Chapter4;

public class MyMethod {
    /*
    Пример синтаксиса написания с возвратом из программы
    через несколько return-операторов:
        void myMeth(){
        //...
        if(done) return;
        // ...
        if(error) return;
        /...
        }
     */
    void myMeth(){
        int i;
        for (i = 0; i < 10; i++) {
            if (i == 5) return; // завершить цикл на значении 5
            System.out.println();
        }
    }
}
