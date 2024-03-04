package Lesson3;

public class Ladder {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 6; x++) {
            if (x == 1) System.out.println("x is equal to 1");
            else if (x == 2) System.out.println("x is equal to 2");
            else if (x == 3) System.out.println("x is equal to 3");
            else if (x == 4) System.out.println("x is equal to 4");
            else System.out.println("x is not in the 1 to 4 diapason");
        }
    }
}
