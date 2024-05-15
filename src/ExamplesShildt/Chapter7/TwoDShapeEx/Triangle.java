package ExamplesShildt.Chapter7.TwoDShapeEx;
// Подкласс для представления треугольников,
// производный от класса TwoDShape
public class Triangle extends TwoDShape {
    private String style;

    // Добавление конструстора в класс Triangle
    Triangle(String s, double w, double h) {
        setWidth(w);
        setHeight(h);
        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
