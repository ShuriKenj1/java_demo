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

    public static void printDogInfo(Dog someDog){
        System.out.println("\nInfo about the dog " + someDog.name + ": "
                + "\nbreed: " + someDog.breed
                + "\nage: " + someDog.age
                + "\nisFemale: " + someDog.isFemale
                + "\ncolour: " + someDog.colour
        );
    }

    public static void printDogInfo(String name){
        System.out.println("This is static method!");
        System.out.println("\nInfo about the dog named " + name);
    }

    static int sum(int a, int b) {
        return a + b;
    }
}
