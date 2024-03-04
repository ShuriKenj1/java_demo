package Lesson3;

import java.io.IOException;

public class InputOutputSystemRead {
    public static void main(String[] args) throws IOException {

        System.out.println("Press any button, then press [ENTER]:");
        char ch = (char) System.in.read();

        System.out.println("You have pressed " + ch);
    }
}
