package Lesson10;

public class StaticDemoApp {
    public static void main(String[] args) {


        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        obj1.x = 10;
        obj2.x = 20;

        System.out.println("obj1.x & obj2.x are independent." +
                "They are equal: " + obj1.x + " and " + obj2.x);

        System.out.println("Static variable y is COMMON"); // common = общая в контексте
        StaticDemo.y = 19;

        System.out.println("(obj1.sum(): " + obj1.sum());
        System.out.println("(obj2.sum(): " + obj2.sum());

        StaticDemo.y = 100;

        System.out.println("(obj1.sum(): " + obj1.sum());
        System.out.println("(obj2.sum(): " + obj2.sum());
    }
}
