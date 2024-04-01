package Lesson10;

public class VariableArgsNumberDemo {

    static void varTest(double d, int ... v){ // порядок аргументов имеет значение!
        System.out.println("Number of arguments: " +
                v.length);

        System.out.println("Contents:");

        for (int i = 0; i < v.length; i++){
            System.out.println(" arg " + i + ": " + v[i]);
        }
    }

    static void varTest(int ... v){
        System.out.println("Number of arguments: " +
                v.length);

        System.out.println("Contents:");

        for (int i = 0; i < v.length; i++){
            System.out.println(" arg " + i + ": " + v[i]);
        }
    }

    public static void main(String[] args) {
        varTest(10);
        varTest(10, 9, -2);
        varTest(4.0, 2);
    }
}
