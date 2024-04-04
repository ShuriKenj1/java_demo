package Lesson11;

public class TwoDimensionShape {

    private double width;
    private double height;

    TwoDimensionShape(){
        width = height = 0.0;
    }

    TwoDimensionShape(double dim){
        width = height = dim;
    }

    TwoDimensionShape(double width, double height){
        this.width = width;
        this.height = height;
    }

    TwoDimensionShape(TwoDimensionShape prototype){
        width = prototype.width;
        height = prototype.height;
    }
    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

     public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    void showDimensions(){
        System.out.println("Width & height: " + width + " " + height);
    }
}
