package Lesson5;

public class Vehicle {

//    Пример построения:
//    access_modifier class ClassName {
//        type instanceVariable1;
//        type instanceVariable2;
//        type instanceVariable3;
//        type instanceVariableN;
//
//        access_modifier returntype methodName1() {
//            method body
//        }
//        access_modifier returntype methodName2(type parameterName) {
//            method body
//        }
//        access_modifier returntype methodName3(type parameterName1, type parameterName2) {
//            method body
//        }
//    }

    int passengers;
    int fuelCap;
    int milesPerGallon;

    Vehicle () {
    }

    Vehicle(int passengers, int fuelCap, int milesPerGallon){
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.milesPerGallon = milesPerGallon;
    }

    void showRange() {
        System.out.println("Vehicle can take "
                + passengers + " passengers on the distance of "
                + fuelCap * milesPerGallon + " miles");
    }

    int calculateRange() {
        int range;
        range = fuelCap * milesPerGallon;
        return range;
    }

    void showRangeWithName(String vehicleName) {
        System.out.println(vehicleName + " can take "
                + passengers + " passengers on the distance of "
                + fuelCap * milesPerGallon + " miles");
    }

    int allInOneAboutRange(String vehicleName) {
        int range;
        range = fuelCap * milesPerGallon;
        System.out.println(vehicleName + " can take "
                + passengers + " passengers on the distance of "
                + range + " miles");
        return range;
    }
}
