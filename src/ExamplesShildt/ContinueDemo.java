package ExamplesShildt;
// Оператор continue
public class ContinueDemo {
    public static void main(String[] args) {
        int i;

        // Вывести четные числа в пределах от 0 до 100
        for (i = 0; i <= 100; i++) {
            if ((i%2) != 0) continue; // завершить шаг итерации цикла =
                                      // = показывает только четные числа
            System.out.println(i);
        }
    }
}
