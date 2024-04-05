package HW.Fourth;

import java.util.Scanner;
public class BankAccount {
    private int ID;
    private int currentBalance;
    private String password;
    private String passwordChk;
    private int chkCounter = 0;
    boolean ifPassChk;

    BankAccount(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    void initializeAccount() {
        Scanner idScan = new Scanner(System.in);
        System.out.println("Enter your ID number: ");
        ID = idScan.nextInt();

        Scanner passwordScan = new Scanner(System.in);
        System.out.println("Create your password: ");
        password = passwordScan.nextLine();

        System.out.println("Account successfully created!" +
                "\n Your current balance: " + currentBalance);
    }

    boolean ifTrueAccount() {
        do {
            System.out.println("\nFirstly, we need to be sure that this account is yours");
            System.out.println("Enter your password: ");
            Scanner checkPass = new Scanner(System.in);
            passwordChk = checkPass.nextLine();

            if (passwordChk.equals(password)) {
                System.out.println("Password correct");
                ifPassChk = true;
            } else if (chkCounter == 2) {
                System.out.println("Sorry, we can't identify you. Try another time.");
            } else {
                System.out.println("Try again");
                chkCounter++;
                ifPassChk = false;
            }
        } while (ifPassChk == false & chkCounter < 2);
        return ifPassChk;
    }

    void BalancePlus() {
        ifTrueAccount();
        if (ifPassChk) {
            System.out.println("Choose sum you want to add to account");
            Scanner moneyPlus = new Scanner(System.in);
            int addToAccount = moneyPlus.nextInt();
            currentBalance = addToAccount + currentBalance;
            System.out.println("Money successfully added.\n" +
                    "Your current balance is " + currentBalance);
        }
    }

    void BalanceMinus() {
        boolean repeat = false;
        ifTrueAccount();
        if (ifPassChk & currentBalance != 0) {
            do {
                System.out.println("Choose sum you want to withdraw from your account");
                Scanner moneyMinus = new Scanner(System.in);
                int withdrawFromAccount = moneyMinus.nextInt();
                if (withdrawFromAccount <= currentBalance) {
                    currentBalance = currentBalance - withdrawFromAccount;
                    System.out.println("Take your money from the ATM.\n" +
                            "Your current balance is " + currentBalance);
                } else if (withdrawFromAccount > currentBalance) {
                    System.out.println("Sorry, you don't have this amount of money in your account." +
                            "\nTry another amount.");
                    repeat = true;
                }
            } while (repeat);
        } else if (currentBalance == 0) {
            System.out.println("You don't have money in your account((((");
        }
    }
}