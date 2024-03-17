package Examples;
// применение оператора break для выхода из цикла
public class BreakDemoEx {
    public static void main(String[] args) {

        int num;
        num = 100;

//        Выполнять цикл до тех пор, пока квадрат значения
//        переменной i меньще значения переменной num
        for (int i = 0; i < num; i++) {
            if (i*i >= num) break; // прекратить цикл, если i*i >= 100
            System.out.print(i + " ");
        }
        System.out.println("Цикл завершен");
    }
}
