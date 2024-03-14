package Lesson5;

public class VarsDemo {
    public static void main(String[] args) {

        int a = 5;
        int b = a;

        System.out.println("a INITIALLY is equal to " + a);
        System.out.println("b INITIALLY is equal to " + b);

        a++;

        System.out.println("a is equal to " + a);
        System.out.println("b is equal to " + b);

        Vehicle car1 = new Vehicle();
        Vehicle car2 = new Vehicle();

        System.out.println("car1.fuelCap INITIALLY is equal to " + car1.fuelCap);
        System.out.println("car2.fuelCap INITIALLY is equal to " + car2.fuelCap);

        car1.fuelCap = 25;

        System.out.println("car1.fuelCap is equal to " + car1.fuelCap);
        System.out.println("car2.fuelCap is equal to " + car2.fuelCap);
    }
}
