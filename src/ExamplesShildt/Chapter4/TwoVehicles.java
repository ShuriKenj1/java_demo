package ExamplesShildt.Chapter4;

public class TwoVehicles {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();

        int range1, range2;

        // Присвоить значения полям в объекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 23;
        minivan.mpg = 18;

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 13;

        // Рассчитать дальность поездки при полном баке
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportcar.fuelcap * sportcar.mpg;

        System.out.println("Мини-фургон может перевезти " +
                minivan.passengers + " пассажиров на расстояние " + range1 +
                " миль");
        System.out.println("Спортивный автомобиль может перевезти " +
                sportcar.passengers + " пассажиров на расстояние " + range2 +
                " миль");
    }
}
