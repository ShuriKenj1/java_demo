package ExamplesShildt.Chapter4;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle mustang = new Vehicle();
        int range;

        // Присвоить значения полям в объекте mustang
        mustang.passengers = 7;
        mustang.fuelcap = 16;
        mustang.mpg = 21;

        // Рассчитать дальность поездки при полном баке
        range = mustang.fuelcap * mustang.mpg;
        System.out.println("Мини-фургон может перевезти " +
                mustang.passengers + " пассажиров на расстояние " + range +
                " миль.");
    }
}
