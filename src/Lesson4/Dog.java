package Lesson4;

public class Dog {

    String colour;
    int age;
    String breed;
    boolean isFemale;
    String name;

    public void printDogInfo(){
        System.out.println("\nInfo about the dog " + name + ": "
                + "\nbreed: " + breed
                + "\nage: " + age
                + "\nisFemale: " + isFemale
                + "\ncolour: " + colour
        );
    }
}
