package HW.Second;

import java.io.IOException;
public class LookingForDotHW {
    public static void main(String[] args) throws IOException {

        char ch, ignore, answer = '.';
        int spaceQuantity = 0;

        do {
            System.out.print("Print something until you type the dot: ");

            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == ' ')
                spaceQuantity++;
            System.out.println("Current SPACE counter: " + spaceQuantity);
            if (ch == answer) System.out.println("\nYou pressed the dot!\n" +
                    "Total SPACE Counter: " + spaceQuantity);
            else System.out.println("Try again\n");
        } while (answer != ch);
    }
}
