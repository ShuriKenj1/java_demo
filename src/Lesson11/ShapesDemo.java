package Lesson11;

public class ShapesDemo {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle("contour",8.0,12.0);
        ColorTriangle t4 = new ColorTriangle("red","contour",8.0,4.0);
        Triangle t3 = new Triangle(4.0);
        Triangle t5 = new Triangle(t3);

        System.out.println("Info about t1:");
        t1.showStyle();
        t1.showDimensions();
        System.out.println("Area is " + t1.areaCalc());

        System.out.println("-------------------");

        System.out.println("Info about t2:");
        t2.showStyle();
        t2.showDimensions();
        System.out.println("Area is " + t2.areaCalc());

        System.out.println("-------------------");

        System.out.println("Info about t3:");
        t3.showStyle();
        t3.showDimensions();
        System.out.println("Area is " + t3.areaCalc());

        System.out.println("-------------------");

        System.out.println("Info about t4:");
        t4.showStyle();
        t4.showColour();
        t4.showDimensions();
        System.out.println("Area is " + t4.areaCalc());

        System.out.println("-------------------");

        System.out.println("Info about t5:");
        t5.showStyle();
        t5.showDimensions();
        System.out.println("Area is " + t5.areaCalc());
    }
}
