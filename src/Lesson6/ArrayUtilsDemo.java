package Lesson6;
import java.util.Arrays;
public class ArrayUtilsDemo {
    public static void main(String[] args) {
        int[] nums = new int[6];
        int[] numsToCopyIn = new int[8];

        ArrayUtils myUtils = new ArrayUtils(nums);
        myUtils.initArray();
        myUtils.printArray();
        myUtils.copyArray(numsToCopyIn);

        ArrayUtils myUtils1 = new ArrayUtils((numsToCopyIn));
        myUtils1.printArray();
    }
}
