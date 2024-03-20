package Lesson7;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
    public static void main(String[] args) throws IOException {
        File myFile = new File("filename.txt");

        if (myFile.createNewFile()) {
            System.out.println("File has been created: " + myFile.getName());
        } else {
            System.out.println("File already exists.");
        }
    }
}
