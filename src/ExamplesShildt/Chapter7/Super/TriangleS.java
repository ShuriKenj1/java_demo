package ExamplesShildt.Chapter7.Super;
// Подкласс для представления треугольников,
// производный от класса TwoDShape
public class TriangleS extends TwoDShape{
    private String style;

    TriangleS() {
        super(); // вызвать конструктор суперкласса по умолчанию
        style = "none";
    }

    TriangleS(String s, double w, double h) {
        super(w, h); // вызвать конструктор суперкласса с двумя аргументами
        style = s;
    }

    TriangleS(double x) {
        super(x); // вызвать конструктор суперкласса с одним аргументом
        style = "закрашенный";
    }

        double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
