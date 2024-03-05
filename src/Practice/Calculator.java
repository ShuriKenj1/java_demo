package Practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int x, y;
        char operation;

        System.out.println("Enter x");

        Scanner input = new Scanner(System.in);
        x = input.nextInt();

        System.out.println("Enter y");
        y = input.nextInt();

        Scanner input1 = new Scanner(System.in);

        System.out.println("Select operation: +, -, *, /, %");
        operation = input1.nextLine().charAt(0);

        if (operation == '+') {
            System.out.println("Sum of x + y is " + (x + y));
        } else if (operation == '-') {
            System.out.println("Deduction of x - y is " + (x - y));
        } else if (operation == '*') {
            System.out.println("Multiplication of x * y is " + (x * y));
        } else if (operation == '/' && y != 0) {
            //уже поменял к домашке на условие с нулем (побрейнштормить над switch, проверка на ноль уже готова)
            System.out.println("Division of x / y is " + (x / y));
        } else if (operation == '%') {
            System.out.println("Module division of x % y is " + (x % y));
        } else System.out.println("Unknown operation");
    }
}
