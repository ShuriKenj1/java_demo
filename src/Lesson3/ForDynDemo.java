package Lesson3;
import java.util.Scanner;

public class ForDynDemo {
    public static void main(String[] args) {
        int i;
        char result = 'a';

        for (i = 0; result != 'B'; i++) {
            System.out.println("Run #" + i);
            Scanner input = new Scanner(System.in);
            result = input.nextLine().charAt(0);
        }
    }
}
