package ExamplesShildt.Chapter7.Final.ErrorMsg;
// Возврат объекта типа String
public class ErrorMsg {
    // Коды ошибок.
    // Константы объявляются с помощью ключевого слова final
    final int OUTERR = 0;
    final int INERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;

    String msgs[] = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Вывод индекса за границы диапазона"
    };

    // Возвратить сообщение об ошибке
    String getErrorMsg(int i) {
        if (i >= 0 & i < msgs.length)
            return msgs[i];
        else
            return "Несуществующий код ошибки";
    }
}
