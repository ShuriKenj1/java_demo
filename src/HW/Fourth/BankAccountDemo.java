package HW.Fourth;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(2500); // you can choose with which amount to start

        account1.initializeAccount();

        account1.BalancePlus();

        account1.BalanceMinus();

        account1.checkBalance();

    }
}
