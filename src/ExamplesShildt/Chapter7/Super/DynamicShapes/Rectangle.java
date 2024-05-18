package ExamplesShildt.Chapter7.Super.DynamicShapes;

public class Rectangle extends TwoDShape {
    // Конструктор по умолчанию
    Rectangle() {
        super();
    }

    // Конструктор класса Rectangle
    Rectangle(double w, double h) {
        super(w, h, "прямоугольник"); // вызвать конструктор суперкласса
    }

    // Создать квадрат
    Rectangle(double x) {
        super(x, "прямоугольник"); // вызвать конструктор суперкласса
    }

    // Создать один объект на основе другого
    Rectangle(Rectangle ob) {
        super(ob); // передать объект конструктору класса TwoDShape
    }

    boolean isSquare() {
        if (getWidth() == getHeight()) return true;
        return false;
    }

    // Переопределение метода area() для класса Rectangle
    double area() {
        return getWidth() * getHeight();
    }
}
