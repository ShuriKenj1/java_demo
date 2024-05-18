package ExamplesShildt.Chapter7.Super.DynamicShapes;
// Подкласс для представления треугольников,
// производный от класса TwoDShape
public class Triangle extends TwoDShape {
    private String style;

    // Конструктор по умолчанию
    Triangle() {
        super();
        style = "none";
    }

    // Конструктор класса Triangle
    Triangle(String s, double w, double h) {
        super(w, h, "треугольник");
        style = s;
    }

    // Конструктор с одним аргументом для построения треугольника
    Triangle(double x) {
        super(x, "треугольник"); // вызвать конструктор суперкласса
        style = "закрашенный";
    }

    // Создать один объект на основе другого
    Triangle(Triangle ob) {
        super(ob); // передать объект конструктору класса TwoDShape
        style = ob.style;
    }

    // Переопределение метода area() для класса Triangle
    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
