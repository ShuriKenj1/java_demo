package Lesson6;

public class ArraysDemo2 {
    public static void main(String[] args) {
        int nums[] = {99, 9, 999, -9, -99, 98, 89, 990, 991, 1919};

        int min, max;

        min = max = nums[0];

        for (int i = 1; i <= 10; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        System.out.println("min is "+ min);
        System.out.println("max is "+ max);
    }
}
