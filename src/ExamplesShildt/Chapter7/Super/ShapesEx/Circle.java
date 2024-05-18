package ExamplesShildt.Chapter7.Super.ShapesEx;

public class Circle extends TwoDShape {

    Circle(double x) {
        super(x);
    }

    double area() {
        return Math.PI * Math.pow(getWidth(), 2);
    }
}
