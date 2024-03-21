package Lesson8;

public class AccountDemo {
    public static void main(String[] args) {
        Account newAcc = new Account("897465132", "456");

        System.out.println(newAcc.phoneNumber);
        System.out.println(newAcc.name);
    }
}
