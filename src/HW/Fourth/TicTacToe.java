package HW.Fourth;
// жесть не получается ну блин(
import java.io.IOException;

public class TicTacToe {
    public static void main(String[] args) throws IOException {

        int fields[] = new int[9];
        char choice;

        for (int i = 0; i < 9; i++) {
            fields[i] = i;
        }

        System.out.println("Welcome to the TicTacToe game!\n" +
                "This is the field:");

//        void printField() {
//            if (i == 2 | i == 5) System.out.print(i + "\n");
//            else System.out.print(i + "\t");
//        }

        System.out.println("\nChoose where to put your 'x' " +
                "with typing the number from 0 to 8: ");
        choice = (char) System.in.read();

//        do {
            switch (choice) {
                case '0':
                    fields[0] = 'x';
                    break;
                case '1':
                    fields[1] = 'x';
                    break;
                case '2':
                    fields[2] = 'x';
                    break;
                case '3':
                    fields[3] = 'x';
                    break;
                case '4':
                    fields[4] = 'x';
                    break;
                case '5':
                    fields[5] = 'x';
                    break;
                case '6':
                    fields[6] = 'x';
                    break;
                case '7':
                    fields[7] = 'x';
                    break;
                case '8':
                    fields[8] = 'x';
                    break;
            }
//        } while ()
    }
}
