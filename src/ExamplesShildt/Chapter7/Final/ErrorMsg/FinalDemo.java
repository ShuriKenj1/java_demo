package ExamplesShildt.Chapter7.Final.ErrorMsg;

import ExamplesShildt.Chapter6.Err;

public class FinalDemo {
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();

        // При вызове метода используются константы,
        // объявленные с помощью ключевого слова final
        System.out.println(err.getErrorMsg(err.OUTERR));
        System.out.println(err.getErrorMsg(err.DISKERR));
    }
}
