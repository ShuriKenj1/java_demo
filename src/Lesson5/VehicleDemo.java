package Lesson5;

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportcar = new Vehicle(2,14,12);

        int rangeMinivan;
        int rangeSportcar;

//        minivan.milesPerGallon = 21;
//        minivan.passengers = 7;
//        minivan.fuelCap = 16;

//        sportcar.milesPerGallon = 12;
//        sportcar.passengers = 2;
//        sportcar.fuelCap = 14;

        String myVarNameDifferceFromOneInMethod = "Minivan";

//        minivan.showRange();
        rangeMinivan = minivan.allInOneAboutRange("Minivan");
//        sportcar.showRange();
        rangeSportcar = sportcar.allInOneAboutRange("Sportcar");

//        rangeMinivan = minivan.calculateRange();
//        System.out.println("Calculated rangeMinivan value: " + rangeMinivan);
    }
}
