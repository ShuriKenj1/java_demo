package Lesson15;

import Lesson6.ArrayUtils;

public class InterDemo {
    public static void main(String[] args) {
        InterfaceImplementation obj = new InterfaceImplementation();

        obj.myMethod1();
        obj.myMethod2();
        obj.myMethod4(2,5);
        MyInterface.myMethod3();
        MyInterface.myMethod5(obj);

        int[] nums = {1, 2, 3};

        ArrayUtils.printArray(nums);
    }
}
