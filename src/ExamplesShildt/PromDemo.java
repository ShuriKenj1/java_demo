package ExamplesShildt;
// Неожиданный результат повышения типов!
public class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;
        char ch1 = 'a', ch2 = 'b';
        ch1 = (char) (ch1 + ch2);
        System.out.println("ch1 and ch2: " + ch1 + ", " + ch2);

        b = 10;
        i = b * b;

        b = 10;
        b = (byte) (b * b); // cast needed!!

        System.out.println("i and b: " + i + ", " + b);
    }
}
