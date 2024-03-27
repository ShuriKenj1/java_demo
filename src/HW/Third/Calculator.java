package HW.Third;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        char ignore;
        int number1, number2, sum;
        double avg;
        boolean comparison;

        System.out.println("Calculator program Demo.");
        System.out.println("This build of Calculator is working only with the numbers from 1 to 10." +
                "\nBe sure to  choose correct numbers.");

        System.out.println("\nFirst number: ");
        number1 = System.in.read() - 48;
        do {
            ignore = (char) System.in.read();
        } while (ignore != '\n');
        System.out.println("Number 1 is " + number1);

        System.out.println("\nSecond number: ");
        number2 = System.in.read() - 48;
        do {
            ignore = (char) System.in.read();
        } while (ignore != '\n');
        System.out.println("Number 2 is " + number2);

        sum = number1 + number2;
        avg = (double) (number1 + number2) / 2;
        comparison = number1 > number2;

        System.out.println("\nYou have pressed " + number1 + " and " + number2);
        System.out.println("Sum of them is " + sum) ;
        System.out.println("Avg of them is " + avg) ;
        System.out.println("Result of comparison:\n" +
                "Is number " + number1 + " more than number " + number2 + "? - " + comparison);
    }
}
