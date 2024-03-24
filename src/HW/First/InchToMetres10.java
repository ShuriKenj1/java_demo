package HW.First;
// Упражнение 10, страница 55
public class InchToMetres10 {
    public static void main(String[] args) {
        double in, m;
        int counter;
    /*
    1 ft = 12 in;
    1 m = 39,37 in
    надо вывести до 12 футов - 144 дюйма - в метры
    */
        counter = 0;

        for(in = 1; in <= 144; in++){
            m = in / 39.37; // преобразовал дюймы в метры
            System.out.println(in + " дюйму соответсвует " +
                    m + " метров");
            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}

