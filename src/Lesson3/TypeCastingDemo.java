package Lesson3;

public class TypeCastingDemo {
    public static void main(String[] args) {
        int i;
        float f;
        long l;
        double d;

//        i = 10;
//        f = i;
        f = 10.5f;
        i = (int) f;

        System.out.println("i and f:" + i + " " + f);

        d = 100012345;
        l = (long) d;

        System.out.println("l and d:" + l + " " + d);
    }
}
