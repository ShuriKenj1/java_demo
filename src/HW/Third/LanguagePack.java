package HW.Third;

import java.io.IOException;

public class LanguagePack {
    public static void main(String[] args) throws IOException {

        char choice, ignore;

        do {
            System.out.println("Hello! Choose your language: ");
            System.out.println("1.English");
            System.out.println("2.French");
            System.out.println("3.Spanish");
            System.out.println("4.German");
            System.out.println("Type in the number: ");

            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (choice < '0' | choice > '5');

        switch (choice) {
            case '1':
                System.out.println("Welcome to the program!");
                break;
            case '2':
                System.out.println("Bienvenue au programme!");
                break;
            case '3':
                System.out.println("Bienvenido al programa!");
                break;
            case '4':
                System.out.println("Willkommen im Programm!");
                break;
        }
    }
}
