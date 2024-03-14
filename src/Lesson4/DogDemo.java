package Lesson4;

public class DogDemo {
    public static void main(String[] args) {
        Dog myDog1 = new Dog();

        myDog1.breed = "Labrador";
        myDog1.age = 10;
        myDog1.isFemale = false;
        myDog1.name = "Bobby";

        myDog1.printDogInfo();

        Dog myDog2 = new Dog();

        myDog2.breed = "Retriever";
        myDog2.age = 2;
        myDog2.isFemale = true;
        myDog2.name = "Jelly";

        myDog2.printDogInfo();
    }
}
