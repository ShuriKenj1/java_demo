package Lesson3;

import java.util.Scanner;

public class IfDemoLesson {
    public static void main(String[] args) {

//        if (condition) {
//            some code
//        } else {
//            some code
//        }

        char ch, answer = 'M';

        System.out.println("The letter from diapason A-Z should be guessed.");
        System.out.println("Try it!");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        ch = input.nextLine().charAt(0);

        if (ch == answer) {
            System.out.println("You are right!");
            System.out.println("You guessed from the the first try!");
        }
        else System.out.println("Try again!");

        System.out.println("Thank you for participating!");
    }
}