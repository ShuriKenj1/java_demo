package Lesson10;

public class NestedClassesDemo {
    public static void main(String[] args) {
        int[] x = {3, 2, 1, 5, 6, 9, 7, 8};

        OuterClass outerClassObj = new OuterClass(x);
        outerClassObj.analyze();
    }
}
