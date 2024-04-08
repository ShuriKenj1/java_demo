package Lesson12;
// абстрактный класс
public abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    TwoDShape(){
        width = height = 0.0;
        name = "none";
    }

    TwoDShape(double w, double h, String n){
        width = w;
        height = h;
        name = n;
    }

    TwoDShape(double x, String n){
        width = height = x;
        name = n;
    }

    public TwoDShape(TwoDShape obj) {
        width = obj.width;
        height = obj.height;
        name = obj.name;
    }

    public String getName(){ return name; }
    double getWidth(){ return width; }
    double getHeight(){ return height; }
    void setWidth(double width){ this.width = width; }
    void setHeight(double height){ this.height = height; }

    public void showDimensions(){
        System.out.println("width and height: " + width + " & " + height);
    }

    abstract double areaCalc();
}
