package HW.Third;

import java.util.Scanner;

public class Multipliers {
    public static void main(String[] args) {

        int i, j, k;

        Scanner input = new Scanner(System.in);

        System.out.println("Your number is: ");
        int number = Integer.parseInt(input.nextLine());

        for (i = number; i <= number; i++) {
            if ((i % 2) == 0 | (i % 3) == 0) {
                System.out.print("Multipliers of " + i + ": \n");
                for (j = 2; j < i; j++) {
                    if ((i % j) == 0) {
                        do {
                            k = i / j;
                            System.out.println(j + " and " + k);
                        } while (j <= k); // надо поменять, while не гибкий - либо убрать совсем do, либо поменять условие на более универсальное
                    }
                }
            } else if ((i / 1) == i & (i / i) == 1) System.out.println("The number " + number + " has no multipliers, so it is a prime number." +
                    "A prime number (or a prime) is a natural number greater than 1 that is not a product of two smaller natural numbers.");
        }
    }
}
