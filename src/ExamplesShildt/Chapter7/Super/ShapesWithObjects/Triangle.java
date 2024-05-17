package ExamplesShildt.Chapter7.Super.ShapesWithObjects;

import ExamplesShildt.Chapter7.Super.ShapesEx.TriangleS;

public class Triangle extends TwoDShape {
    private String style;

    Triangle() {
        super(); // вызвать конструктор суперкласса по умолчанию
        style = "none";
    }

    Triangle(String s, double w, double h) {
        super(w, h); // вызвать конструктор суперкласса с двумя аргументами
        style = s;
    }

    Triangle(double x) {
        super(x); // вызвать конструктор суперкласса с одним аргументом
        style = "закрашенный";
    }

    // Создать один объект на основе другого
    Triangle(Triangle ob) {
        super(ob); // передача объекта конструктору класса TwoDShape
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
