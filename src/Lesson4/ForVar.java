package Lesson4;

public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        for (int i = 1; i <= 5; i++) {
            System.out.println("now i is equal to " + i);
            sum += i;
            System.out.println("current sum is equal to " + sum);
            fact *= i;
            System.out.println("current fact is equal to " + fact);
            System.out.println();
        }

        System.out.println("Sum is equal to " + sum);
        System.out.println("Factorial is equal to " + fact);
    }
}
