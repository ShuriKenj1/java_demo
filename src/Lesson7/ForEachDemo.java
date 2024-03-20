package Lesson7;

public class ForEachDemo {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        String[] strings = {"cat", "dog", "bird"};

        for (int num : nums) {
            num += 1;
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int x : nums) {
            sum += x;
            if (x == 5) break;
        }
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] += 1;
//        }

//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }


        // для каждого элемента массива, называемого "х",
        // сделай следующее (то, что внутри for)
//        for (int x: nums) {
//            sum += x;
//        }
//
//        for (String x: strings) {
//            System.out.println("array element: " + x);
//        }
//
        System.out.println("sum is equal to " + sum);

    }
}
