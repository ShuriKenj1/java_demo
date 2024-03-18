package Lesson6;

public class TwoDimArrayDemo {
    public static void main(String[] args) {
        int t, i;

        int[][] table = new int[3][4];

        for (t = 0; t < 3; t++) {
            for (i = 0; i < 4; i++) {
                table [t][i] = (t*4) + i + 1;
                System.out.print(" table[" + t + "][" + i + "]:" + table[t][i] + "\t\t");
            }
            System.out.println();
        }

        int[][] tableUnreg = new int[3][];
        tableUnreg[0] = new int[4];
        tableUnreg[1] = new int[2];
        tableUnreg[2] = new int[5];
    }
}
