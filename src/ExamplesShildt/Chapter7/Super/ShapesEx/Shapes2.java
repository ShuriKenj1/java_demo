package ExamplesShildt.Chapter7.Super.ShapesEx;
public class Shapes2 {
    public static void main(String[] args) {
        TriangleS t1 = new TriangleS("закрашенный", 4.0, 4.0);
        TriangleS t2 = new TriangleS("контурный", 8.0, 12.0);

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь - " + t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь - " + t2.area());
    }
}
