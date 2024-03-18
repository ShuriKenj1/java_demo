package Lesson6;

import java.io.FileOutputStream;

public class ArrayCopy {
    public static void main(String[] args) {
        int i;
        int[] initialArray = new int[10];
        int[] independentCopy = new int[10];

        for (i = 0; i < initialArray.length; i++) initialArray[i] = i;

        if (independentCopy.length >= initialArray.length)
            for (i = 0; i < independentCopy.length; i++)
                independentCopy[i] = initialArray[i];

        initialArray[0] = 1000000;

        for (i = 0; i < independentCopy.length; i++)
            System.out.print(independentCopy[i] + " ");

//        System.out.println("Array 1:");
//        for (i = 0; i < initialArray.length; i++) {
//            System.out.print(initialArray[i] + " ");
//        }
//
//        System.out.println("Array 2:");
//        for (i = 0; i < independentCopy.length; i++) {
//            System.out.print(independentCopy[i] + " ");
//
//            initialArray[0] = 99;
//            initialArray[1] = -10;
//            initialArray[2] = 99;
//            initialArray[3] = 99;
//            initialArray[4] = 99;
//            initialArray[5] = 99;
//
//            System.out.println("Array 1 AFTER INITIALIZATION:");
//            for (i = 0; i < initialArray.length; i++) {
//                System.out.print(initialArray[i] + " ");
//            }
//            System.out.println("Array 2 BEFORE MAKING EQUAL TO ARRAY1:");
//            for (i = 0; i < independentCopy.length; i++) {
//                System.out.print(independentCopy[i] + " ");
//            }
//
//            independentCopy = initialArray;
//
//            System.out.println("Array 2 BEFORE MAKING EQUAL TO ARRAY1:");
//            for (i = 0; i < independentCopy.length; i++) {
//                System.out.print(independentCopy[i] + " ");
//            }
//        }
    }
}
