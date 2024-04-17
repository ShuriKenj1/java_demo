package HW.Fifth;
// Упражнение 5.2
// Класс, реализующий очередь для хранения символов
public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Использование очереди bigQ для " +
                "сохранения алфавита");
        // Поместить буквенные символы в очередь bigQ
        for (i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        // Извлечь буквенные символы из очереди bigQ и отобразить
        System.out.print("Содержимое очереди bigQ: ");
        for (i = 0; i < 26; i++){
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("Использование очереди smallQ " +
                "для генерации ошибок");

        // Использовать очередь smallQ для генерации оишбок
        for (i = 0; i < 5; i++){
            System.out.print("Попытка сохранения " +
                    (char) ('Z' - i));

            smallQ.put((char) ('Z' - i));

            System.out.println();
        }
        System.out.println();

        // Дополнительные ошибки при обращении к очереди smallQ
        System.out.print("Содержимое smallQ: ");
        for (i = 0; i < 5; i++){
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
    }
}
