package Lesson4;

public class Dog {

    String colour;
    int age;
    String breed;
    boolean isFemale;
    String name;

    public Dog() {
        name = "unknown";
    }

    Dog(String name){
        this.name = name;
    }

    Dog(String colour, int age, String breed, boolean isFemale,String name) {
        this.colour = colour;
        this.age = age;
        this.breed = breed;
        this.isFemale = isFemale;
        this.name = name;
    }
    public void printDogInfo(){
        System.out.println("\nInfo about the dog " + name + ": "
                + "\nbreed: " + breed
                + "\nage: " + age
                + "\nisFemale: " + isFemale
                + "\ncolour: " + colour
        );
    }
}
