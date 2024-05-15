package ExamplesShildt.Chapter7.Super.ShapesEx;

public class Shapes3 {
    public static void main(String[] args) {
        TriangleS t1 = new TriangleS();
        TriangleS t2 = new TriangleS("контурный", 8.0, 12.0);
        TriangleS t3 = new TriangleS(4.0);

        t1 = t2;

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь - " + t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь - " + t2.area());

        System.out.println();

        System.out.println("Информация о t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Площадь - " + t3.area());

        System.out.println();
    }
}
