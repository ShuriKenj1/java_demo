package Lesson4;

public class BreakLabelDemo {
    public static void main(String[] args) {
        int i;

        zero:
        for (i = 1; i < 4; i++) {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("\ni is equal to " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break zero;
                    }
                    System.out.println("After code block three");
                }
                System.out.println("After code block two");
            }
            System.out.println("After code block one");
        }
        System.out.println("After for loop");
    }
}
