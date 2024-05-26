package HW.Sixth.BankSystem;

import com.sun.tools.javac.Main;

import java.util.Random;
import java.util.Scanner;

public class Client {
    private String username;
    private String password;
    private int ID;
    public Client() {
        setUsername();
        setPassword();
        setID();
        MainMenu menu = new MainMenu(getID());
    }
    private void setID() {
        Random rand = new Random();
        ID =  rand.nextInt(900000) + 100000;
    }
    private void setUsername() {
        System.out.println("Your name:");
        Scanner scanner = new Scanner(System.in);
        username = scanner.nextLine();
    }
    private void setPassword() {
        System.out.println("Password:");
        Scanner scanner0 = new Scanner(System.in);
        password = scanner0.nextLine();
//        if (password.length() < 6) {
//            System.out.println("Sorry, your password is too short, try again.");
//            setPassword();
//        }
    }
    public int getID() {
        return ID;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
}
