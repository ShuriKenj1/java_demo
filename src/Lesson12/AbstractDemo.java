package Lesson12;

import Lesson6.ArrayUtils;

public class AbstractDemo {
    public static void main(String[] args) {
        Triangle one = new Triangle();
        Rectangle two = new Rectangle();
        // можем создать, потому что в данном классе
        // переопределен абстрактный метод

        TwoDShape[] shapes = new TwoDShape[4];

        shapes[0] = new Triangle("contour", 8.0, 12.0);
        shapes[1] = new Rectangle(10.0, 12.0);
        shapes[2] = new Triangle(4);
        shapes[3] = new Rectangle(7.0);

        ArrayUtils.printArray(shapes);

        ErrorMessage err = new ErrorMessage();

        System.out.println(err.getErrorMessage(err.DISKERR));
        System.out.println(err.getErrorMessage(err.INERR));
        System.out.println(err.getErrorMessage(err.INDEXERR));
        System.out.println(err.getErrorMessage(ErrorMessage.OUTERR));
    }
}
