package ExamplesShildt.Chapter7.Super;

public class TwoDShape {
    private double width;
    private double height;

    // Конструктор по умолчанию
    TwoDShape() {
        width = height = 0.0;
    }

    // Параметризованный конструктор
    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    // Конструирование объекта с одинаковыми значениями
    // переменных экземпляра width и height
    TwoDShape(double x) {
        width = height = x;
    }

    // Методы доступа к закрытым переменным экземпляра width и height
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    void showDim() {
        System.out.println("Ширина и высота - " +
                width + " и " + height);
    }
}
