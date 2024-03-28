package Lesson9;

public class OverloadDemo {
    public static void main(String[] args) {

        String input = "0";

        OverloadDemo myObj = new OverloadDemo();
        myObj.printHello(input);
    }

    void printHello(){
        System.out.println("Hello!");
    }

    void printHello(String name){
        System.out.println("Hello " + name + "!");
    }

    void printHello(int day){
        System.out.println("Hello on this " + day + "!");
    }

    void printHello(int day, String name){
        System.out.println("Hello on this " + day + "!");
    }
}
