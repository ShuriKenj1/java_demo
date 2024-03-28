package Lesson9;

public class AccessModifiersDemo {
    public static void main(String[] args) {

//        Person myObj = new Person("Kostya", 16);
//
//        myObj.setAge(25);
//
//        System.out.println(myObj.getAge());

        Block block1 = new Block(10,2,5);
        Block block2 = new Block(4,5,5);
        System.out.println(block1.isSameBlock(block2));
        System.out.println(block1.isSameVolume(block2));
        Block block3 = block1.createDuplicate();
        System.out.println(block1.isSameBlock(block3));
    }
}
