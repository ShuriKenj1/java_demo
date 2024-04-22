package Lesson16;

import java.util.Scanner;

public class EnumDemo {
    public static void main(String[] args) {
        Transport tr;

        tr = Transport.AIRPLANE;

        System.out.println("Value of tr: " + tr);

        if (tr == Transport.TRAIN){
            System.out.println("tr is equal to TRAIN");
        }

        switch (tr){
            case CAR -> System.out.println("It' a car");
            case TRAIN -> System.out.println("It' a train");
            case TRUCK -> System.out.println("It' a truck");
            case BOAT -> System.out.println("It' a boat");
            case AIRPLANE -> System.out.println("It' an airplane");
        }

        Transport[] allTransport = Transport.values();

        try {
            tr = Transport.valueOf("HORSE");
        } catch (IllegalArgumentException e){
            tr = Transport.UNDEFINED;
        }

        System.out.println("Choose your preferred transport type among following:");
        for (Transport t: allTransport){
            System.out.println(t);
            System.out.println("Speed: " + t.getSpeed());
        }

//        Scanner in = new Scanner(System.in);
//        String candidate = in.nextLine();
//
//        try {
//            tr = Transport.valueOf(candidate.toUpperCase());
//        } catch (IllegalArgumentException e){
//            System.out.println("Sorry! There is no such type. The value will be set to undefined.");
//            tr = Transport.UNDEFINED;
//        }

        System.out.println("tr is " + tr);
    }
}
