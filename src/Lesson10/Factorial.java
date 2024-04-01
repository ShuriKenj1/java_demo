package Lesson10;

public class Factorial {

    int a;

    static int iterativeFactorialCalc(int n){
        int t, result;

        result = 1;

        for (t = 2; t <= n; t++) result *= t;

        return result;
    }

    static int recursiveFactorialCalc(int n){
        int result;

        if (n == 1) return 1;
        result = recursiveFactorialCalc(n-1) * n;
//      result = (((1 * 2) * 3) * 4) * 5;

        return result;
    }

    public static void main(String[] args) {
        Factorial myObj = new Factorial();

        System.out.println(Factorial.iterativeFactorialCalc(5));
        System.out.println(Factorial.iterativeFactorialCalc(4));
        System.out.println(Factorial.iterativeFactorialCalc(3));

        System.out.println(Factorial.recursiveFactorialCalc(5));
        System.out.println(Factorial.recursiveFactorialCalc(4));
        System.out.println(Factorial.recursiveFactorialCalc(3));
    }
}
