package Exercises;

import java.util.Scanner;

public class GalToLitHW {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Gallons are equal to:");

        double gallons = input.nextDouble();

        double liters = 3.7854 * gallons;

        System.out.println(gallons + " галлонам соответствует " +
                liters + " литров");
    }
}
