package Lesson13;

public class Animal implements Swimmable{
    int size;
    String color;
    int weight;

    @Override
    public void swim() {
        System.out.println("swim swim swim");
    }
}
