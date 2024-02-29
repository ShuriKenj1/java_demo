package Lesson2;

public class IncrDecrDemo {
    public static void main(String[] args) {
        int x, y;
        x = 2;
        y = -45;

        System.out.println("Initial values of x & y:" + x + " " + y);
        x++;
        y++;
        System.out.println("After postfix increment:" + x + " " + y);
        x--;
        y--;
        System.out.println("After postfix decrement:" + x + " " + y);
        ++x;
        ++y;
        System.out.println("After prefix increment:" + x + " " + y);
        --x;
        --y;
        System.out.println("After prefix decrement:" + x + " " + y);
        System.out.println("After prefix decrement:" + ++x + " " + ++y);

        x = x + 1;
        System.out.println("was x = x + 1, now x is " + x);
        x++;
        System.out.println("was x++, now x is " + x);
        ++x;
        System.out.println("was ++x, now x is " + x);
        x += 5;
        System.out.println("was x += 5, now x is " + x);
        x -= 5;

        x *= 5;
        x = x * 5;

        x /= 5;
        x = x / 5;

        x = 12;
        x -= 5;
        System.out.println("x = " + x);

        boolean t = true;
        boolean f = false;

        t ^= (x > 5);
        t = t ^ (x > 5);

        System.out.println("t = " + t);
    }
}
