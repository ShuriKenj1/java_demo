package HW.Third;

import java.util.Scanner;

public class DividersOfNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Your number is: ");
        int number = Integer.parseInt(input.nextLine());

        for (int i = number; i <= number; i++) {
            System.out.print("Dividers of " + i + ": ");
            for (int j = 2; j <= i / 2; j++) {
                if ((i % j) == 0) {
                    System.out.print(j + " ");
                }
            }
        }
    }
}
