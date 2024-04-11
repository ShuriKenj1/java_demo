package Lesson13;

public class SeriesDemo {
    public static void main(String[] args) {
        ByTwo ob2 = new ByTwo();
        ByThree ob3 = new ByThree();

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
    }

    public static void showSeries(int x, Series ser) {
        for (int i = 0; i < 5; i++){
            System.out.println("Next value: " +
                    ser.getNext());
        }
    }
}
