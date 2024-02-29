package Lesson2;

import java.util.Scanner;

public class LogicalDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = input.nextLine();

        System.out.println("Do you have a job? Answer yes or no.");
        String answer = input.nextLine();

        System.out.println("Are you a hardworking person? Answer yes or no.");
        String answer2 = input.nextLine();

        if (answer.equalsIgnoreCase("yes") && answer2.equalsIgnoreCase("yes")) System.out.println("Congratulations!");
        else System.out.println("Do you want to work with us?");
    }
}
