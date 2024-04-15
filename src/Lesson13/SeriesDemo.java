package Lesson13;

import Lesson6.ArrayUtils;

public class SeriesDemo {
    public static void main(String[] args) {
        ByTwo ob2 = new ByTwo();
        ByThree ob3 = new ByThree();
        ByFives ob5 = new ByFives();

        showSeries(5, ob2);

        System.out.println("RESET");
        ob2.reset();
        showSeries(5, ob2);

        System.out.println("Start value set to 100");
        ob2.setStart(100);
        showSeries(5, ob2);
        System.out.println("Previous value was:");
        System.out.println(ob2.getPrevious());

        System.out.println("BY THREE:");
        showSeries(5, ob3);

        System.out.println("--------------------getNextArray for different classes' objects");


        ob2.reset();
        ob3.reset();
        ob5.reset();
        ArrayUtils.printArray(ob2.getNextArray(10));
        ArrayUtils.printArray(ob3.getNextArray(10));
        ArrayUtils.printArray(ob5.getNextArray(10));
    }

    public static void showSeries(int x, Series ser) {
        for (int i = 0; i < 5; i++){
            System.out.println("Next value: " +
                    ser.getNext());
        }
    }
}
