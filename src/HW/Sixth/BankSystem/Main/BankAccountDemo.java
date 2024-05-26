package HW.Sixth.BankSystem.Main;

import HW.Sixth.BankSystem.Client;
import HW.Sixth.BankSystem.MainMenu;

public class BankAccountDemo {
    public static void main(String[] args) {
        Client client0 = new Client();
//        System.out.println(client0.getID());
//        System.out.println(client0.getPassword());
//        System.out.println(client0.getUsername());
        MainMenu.showMenu();
    }
}
