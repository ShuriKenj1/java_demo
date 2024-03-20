package Lesson7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileDemo {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("filename.txt");
        Scanner myReader = new Scanner(myFile);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
        myFile.delete();
    }
}