package Lesson12;

public class Rectangle extends TwoDShape{

    Rectangle(){
        super();
    }

    Rectangle(double w, double h){
        super(w, h, "rectangle");
    }

    Rectangle(double x){
        super(x, "rectangle");
    }

    boolean isSquare(){
        return getHeight() == getWidth();
    }
    @Override
    double areaCalc() {
        return getWidth() * getHeight();
    }
}
