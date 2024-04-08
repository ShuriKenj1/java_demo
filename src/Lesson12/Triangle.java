package Lesson12;

public class Triangle extends TwoDShape{

    private String style;

    Triangle(){
        super();
        style = "none";
    }

    Triangle(String s, double w, double h){
        super(w, h, "triangle");
        style = s;
    }

    Triangle(double w, double h){
        super(w, h, "triangle");
        style = "none";
    }

    Triangle(double x){
        super(x, "triangle");
        style = "colored";
    }

    Triangle(Triangle obj){
        super(obj);
        style = obj.style;
    }

    @Override
    double areaCalc() {
        return getWidth() * getHeight()/2;
    }
}
