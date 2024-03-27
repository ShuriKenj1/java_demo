package HW.Third;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        do {
            System.out.println("\nPrint your number: ");
            int userType = Integer.parseInt(number.nextLine());

            if ((userType % 2) == 0) {
                System.out.println("This number is even");
            } else System.out.println("This number is odd");
        } while (true);
    }
}
