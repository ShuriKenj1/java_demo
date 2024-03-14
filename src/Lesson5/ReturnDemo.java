package Lesson5;

public class ReturnDemo {

//    return
//    return value

    public int sum(int a, int b) {
        System.out.println("BEFORE RETURN");
        return a + b;
//        System.out.println("AFTER RETURN");
    }
    public String sayHello(String name){
        return "hello " + name;
    }

    public int max(int x, int y) {
        if (x < y) {
            return y;
        } else if (x == y){
            return 0;
        } else return x;
    }

    public void printIfOdd(int number){
        if (number % 2 == 0) {
            System.out.println("I'm gonna return now!");
            return;
        }
        System.out.println(number);
    }

    public static void main(String[] args) {
        ReturnDemo example = new ReturnDemo();

        for (int i = 0; i < 10; i++) {
            System.out.println("max of " + i + " and 5 is: " + example.max(5, i));
        }
    }
}
