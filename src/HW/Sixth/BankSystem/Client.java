package HW.Sixth.BankSystem;

import java.util.Scanner;

public class Client {
    private String username;
    private String password;
    private double ID;

    Client() {
        setUsername();
        setPassword();
        setID();
    }
    public double getID() {
        return ID;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public void setID() {
        ID = Math.random();
    }
    public void setUsername() {
        System.out.println("Login:\n");
        Scanner scanner = new Scanner(System.in);
        username = scanner.nextLine();
    }
    public void setPassword() {
        System.out.println("Password:\n");
        Scanner scanner = new Scanner(System.in);
        password = scanner.nextLine();
    }
}
