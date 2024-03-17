package Examples;
// Чтение символа с клавиатуры
public class ExampleKbIn {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch;

        System.out.println("Нажмите нужную клавишу, а затем " +
                "клавишу ENTER: ");

        ch = (char) System.in.read(); // получить символ

        System.out.println("Вы нажали клавишу " + ch);
    }

}
