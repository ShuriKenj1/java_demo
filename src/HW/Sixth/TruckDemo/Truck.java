package HW.Sixth.TruckDemo;
public class Truck extends Vehicle{
    private int cargocap; // грузоподъемность в фунтах

    // Конструктор класса Truck
    Truck(int p, int f, int m, int c) {
        // Инициализация членов класса Vehicle
        // с использованием конструктора этого класса
        super(p, f, m);
        cargocap = c;
    }

    // Методы доступа к переменной cargocap
    int getCargocap() { return cargocap; }
    void putCargocap(int c) { cargocap = c; }
}
