package ExamplesShildt.Chapter4;

public class Vehicle {
    int passengers; // пассажиры
    int fuelcap; // емкость топливного бака
    int mpg; // потребление топлива в милях на галлон

    // Отобразить дальность поездки транспортного средства
    int range(){
        return fuelcap * mpg; // возврат дальности поездки
                              // для заданного транспортного средства
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        double gallons;
        int dist = 252;

        // Присвоить значения полям в объекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Присвоить значения полям в объекте sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelneeded(dist);

        System.out.println("Для преодоления " + dist +
                " миль мини-фургону требуется " +
                gallons + " галлонов топлива");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("Для преодоления " + dist +
                " миль спортивному автомобилю требуется " +
                gallons + " галлонов топлива");
    }
}

class RetMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        // Присвоить значения полям в объекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Присвоить значения полям в объекте sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

//        Получить дальность поездки для разных транспортных средств
//        range1 = minivan.range();   - присовение переменной значения,
//        range2 = sportscar.range(); | возвращаемого методом

        System.out.println("Мини-фургон может перевезти " +
                minivan.passengers + " пассажиров на расстояние " + minivan.range() + " миль.");

        System.out.println("Спортивный автомобиль может перевезти " +
                sportscar.passengers + " пассажиров на расстояние " + sportscar.range() + " миль.");
    }
}
