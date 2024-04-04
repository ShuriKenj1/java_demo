package Lesson11;

import java.util.concurrent.TransferQueue;

public class Triangle extends TwoDimensionShape {

    String style;

    Triangle(){
        super();
        style = "none";
    }

    Triangle(double x){
        super(x);
        style = "coloured";
    }

    Triangle(String style, double width, double height){
        super(width, height);
        this.style = style;
    }

    Triangle(Triangle prototype) {
        super(prototype);
        style = prototype.style;
    }

    double areaCalc(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Style is " + style);
    }
}
