package Lesson4;

import java.util.Scanner;

public class DoWhileGuessGame {
    public static void main(String[] args) {
        char ch, answer = 'M';
        boolean wantsToContinue = false;

        System.out.println("The letter from diapason A-Z should be guessed.");
        System.out.println("Try it!");

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your char:");
            ch = input.nextLine().charAt(0);

            if (ch == answer) {
                System.out.println("You are right!");
                wantsToContinue = false;
            } else {
                System.out.println("Sorry but the letter you try to guess is closer to the ");
                if (ch < answer) {
                    System.out.println("end of the alphabet");
                } else {
                    System.out.println("beginning of the alphabet");
                }
                System.out.println("Do you want to try again? Enter y for yes.");
                ch = input.nextLine().charAt(0);
                if (ch == 'y') wantsToContinue = true;
            }

        } while (wantsToContinue);

        System.out.println("Good bye!");
    }
}