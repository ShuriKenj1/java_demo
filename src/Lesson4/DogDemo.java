package Lesson4;

public class DogDemo {
    public static void main(String[] args) {
        Dog myDog0 = new Dog();
        Dog myDog1 = new Dog("black", 10,"Labrador", false, "Bobby");

        Dog myDog2 = new Dog("white", 2, "Retriever", true, "Jelly");
        Dog myDog3 = new Dog("Casper");

        myDog0.printDogInfo();
        myDog1.printDogInfo();
        myDog2.printDogInfo();
        myDog3.printDogInfo();

        Dog instanceOfDog = new Dog();
        Dog instanceOfDog2 = new Dog();

        instanceOfDog.printDogInfo();
        instanceOfDog2.printDogInfo();

        Dog.printDogInfo(instanceOfDog);
        Dog.printDogInfo(instanceOfDog2);

        Dog.sum(2,3); // если непонятно, убери static из Dog строка 49
    }
}
