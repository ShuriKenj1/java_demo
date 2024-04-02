package ExamplesShildt.Chapter4;

public class Vehicle {
    int passengers; // пассажиры
    int fuelcap; // емкость топливного бака
    int mpg; // потребление топлива в милях на галлон

    // Это конструктор класса Vehicle
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Отобразить дальность поездки транспортного средства
    int range(){
        return fuelcap * mpg; // возврат дальности поездки
                              // для заданного транспортного средства
    }

    // Рассчитать объем топлива, необходимого транспортному
    // средству для преодоления заданного расстояния
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}
class VehConsDemo {
    public static void main(String[] args) {
        // Полностью сконструировать объекты транспортных средств
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportscar = new Vehicle(2,14,12);
        double gallons;
        int dist = 252;

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

class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportscar = new Vehicle(2,14,12);
        double gallons;
        int dist = 252;

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
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportscar = new Vehicle(2,14,12);

//        Все что ниже - старая форма записи, для архива
//        Присвоить значения полям в объекте minivan
//        minivan.passengers = 7;
//        minivan.fuelcap = 16;
//        minivan.mpg = 21;
//
//        // Присвоить значения полям в объекте sportscar
//        sportscar.passengers = 2;
//        sportscar.fuelcap = 14;
//        sportscar.mpg = 12;
//
//        Получить дальность поездки для разных транспортных средств
//        range1 = minivan.range();   - присовение переменной значения,
//        range2 = sportscar.range(); | возвращаемого методом

        System.out.println("Мини-фургон может перевезти " +
                minivan.passengers + " пассажиров на расстояние " + minivan.range() + " миль.");

        System.out.println("Спортивный автомобиль может перевезти " +
                sportscar.passengers + " пассажиров на расстояние " + sportscar.range() + " миль.");
    }
}
