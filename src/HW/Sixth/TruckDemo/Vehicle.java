package HW.Sixth.TruckDemo;

public class Vehicle {
    private int passengers; // пассажиры
    private int fuelcap; // емкость топливного бака в галлонах
    private int mpg; // потребление топлива в милях на галлон

    // Это конструктор класса Vehicle
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Возвратить дальность поездки транспортного средства
    int range() {
        return fuelcap * mpg;
    }

    // Рассчитать объем топлива, необходимого транспортному
    // средству для преодоления заданного расстояния
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    // Методы доступа к переменным экземпляра
    int getPassengers() { return passengers; }
    void setPassengers(int p) { passengers = p; }
    int getFuelcap() { return fuelcap; }
    void setFuelcap(int f) { fuelcap = f; }
    int getMpg() { return mpg; }
    void setMpg(int m) { mpg = m; }
}