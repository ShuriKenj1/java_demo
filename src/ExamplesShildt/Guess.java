package ExamplesShildt;
import java.io.IOException;
public class Guess {
    public static void main(String[] args) throws IOException {

        char ch, answer = 'S';

        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.print("Попытайтесь ее угадать: ");

        ch = (char) System.in.read(); // получить символ с клавиатуры

        if (ch == answer) System.out.println("** Правильно! **");
    }
}
