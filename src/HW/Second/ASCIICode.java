package HW.Second;

import java.io.IOException;

public class ASCIICode {
    public static void main(String[] args) throws IOException {

        char ch, ignore, answer = '.';
        int registerCounter = 0;

        do {
            System.out.print("\nPrint something: ");

            ch = (char) System.in.read();


            if (ch >= 'a' & ch <= 'z') {
                ch -= 32;
                System.out.println("The letter you pressed in uppercase is " + ch);
                registerCounter++;
            }
            else if (ch >= 'A' & ch <= 'Z') {
                ch += 32;
                System.out.println("The letter you pressed in lowercase is " + ch);
                registerCounter++;
            } else System.out.println("You have pressed " + ch);

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) System.out.println("\nYou pressed the dot!\n" +
                    "Total changed registers are " + registerCounter);
        } while (answer != ch);
    }
}
