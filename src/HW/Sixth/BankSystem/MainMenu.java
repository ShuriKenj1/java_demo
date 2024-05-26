package HW.Sixth.BankSystem;

import java.util.Scanner;

public class MainMenu {
    private static int clientID;

    public MainMenu(int ID) {
        ID = clientID;
    }

    public static int getClientID() {
        return clientID;
    }

    public static void showMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Check your Basic Account");
        System.out.println("2. Check your Savings Account");
        System.out.println("3. History");
        System.out.println("4. Close Program");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                BasicAccount basicAccount0 = new BasicAccount(getClientID());
                break;
            case 2:
                SavingsAccount savingsAccount0 = new SavingsAccount(getClientID());
                break;
            case 3:
                TransactionsList transactionsList0 = new TransactionsList(getClientID());
                break;
            case 4:
                break;
        }
    }
}
