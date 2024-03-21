package Lesson8;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Account {
    String phoneNumber;
    String name;
    byte age;

    Account(String phoneNumber, String name){
        while (! Pattern.matches("\\d{9}", phoneNumber) |
                ! Pattern.matches("[A-Z][a-z]{1,10}", name)) {
            System.out.println("Sorry! This number does not match the required format." +
                    "\nTry again. \nEnter your number first:");
            Scanner input = new Scanner(System.in);
            phoneNumber = input.nextLine();
            System.out.println("\nNow enter your name:");
            name = input.nextLine();
        }
        this.phoneNumber = phoneNumber;
        this.name = name;
        System.out.println("Successfully created");
    }
}
