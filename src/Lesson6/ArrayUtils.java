package Lesson6;

import Lesson12.TwoDShape;

public class ArrayUtils {

    int[] array;

    public ArrayUtils(int[] array) {
        this.array = array;
    }

    public void printArray() {
        System.out.println();
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static void printArray(int[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void initArray() {
        for (int i = 0; i < array.length; i++)
            array[i] = i;
    }

    public int[] copyArray(int[] arrayToCopyIn) {
        for (int i = 0; i < arrayToCopyIn.length; i++) {
            if (i < array.length)
                arrayToCopyIn[i] = array[i];
            else break;
        }
        return arrayToCopyIn;
    }

    public static void printArray(TwoDShape[] array) {
        // благодаря тому, что метод принимает массивы типа TwoDShape,
        // чей класс является материнским для Rectangle и для Triangle
        // этот метод стал универсален, и не нужно прописывать в отдельности для
        // Rectangle и Triangle
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getName());
            array[i].showDimensions();
        }
    }
}
