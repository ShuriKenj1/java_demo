package Lesson15;

public class NestedTryBlocksDemo {
    public static void main(String[] args) {
        int[] arr1 = {4, 8, 6, 200, 7, 24, 5108, 43};
        int[] arr2 = {1, 4, 0, 31, 0, 9};

        try {
            for (int i = 0; i < arr1.length; i++) {
                try {
                    System.out.println("arr1[" + i + "]/arr2[" + i + "] = " + arr1[i] / arr2[i]);
                } catch (ArithmeticException exc) {
                    System.out.println("ARITHMETIC EXCEPTION");
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("The element was not found.");
            System.out.println("Fatal error! The program execution is stopped");
        }

        System.out.println("After catch");
    }
}
