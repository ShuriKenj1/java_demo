package Lesson6;

public class ArrayUtils {

    int[] array;

    ArrayUtils(int[] array) {
        this.array = array;
    }

    public void printArray() {
        System.out.println();
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
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
}
