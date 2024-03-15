package Examples;
// Демонстрация автоматического преобразования типа long в тип double
public class ExampleLtoD {
    public static void main(String[] args) {
        long L;
        double D;

        L = 100123285L;
        D = L;

        System.out.println("L и D " + L + ", " + D);
    }
}
