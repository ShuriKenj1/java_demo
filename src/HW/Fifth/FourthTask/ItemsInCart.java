package HW.Fifth.FourthTask;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ItemsInCart {
    public static void main(String[] args) throws IOException {
        int cart;
        int sum = 0;
        double total = 0;
        boolean end = false;
        String yesno;

        System.out.println("This is the cart. You can add as much positions as you want." +
                "\nWhen you will be ready to proceed - write down '0'.");
        do {
            do {
                try {
                    Scanner in = new Scanner(System.in);
                    cart = in.nextInt();
                    sum += cart;
                } catch (InputMismatchException e){
                    System.out.println("You can write here only cost using numbers");
                    Scanner in = new Scanner(System.in);
                    cart = in.nextInt();
                    sum += cart;
                }
            } while (cart != 0);
            if (sum > 10000) {
                total = sum - (sum * 0.2);
                System.out.println("Congratulations! You have saved " + (sum - total) + "$");
                end = true;
            } else if (sum > 1000) {
                total = sum - (sum * 0.1);
                System.out.println("Congratulations! You have saved " + (sum - total) + "$");
                end = true;
            } else if (sum < 1000) {
                System.out.println("Spend " + (1000 - sum) + " more to get the discount.");
                System.out.println("Do you want to continue?");
                Scanner input = new Scanner(System.in);
                yesno = input.nextLine();
                if (yesno.equals("y"))
                    end = false;
                else if (yesno.equals("n"))
                    end = true;
            }
        } while (!end);
    }
}
