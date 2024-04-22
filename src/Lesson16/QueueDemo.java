package Lesson16;

import Lesson15.Dawg;
import Lesson4.Dog;
import com.sun.jdi.InterfaceType;

public class QueueDemo {
    public static void main(String[] args) {
        FixedQueue bigQ = new FixedQueue(100);
        FixedQueue smallQ = new FixedQueue(4);
        DynamicQueue dynQueueObj = new DynamicQueue(5);
        CircularQueue circQueueObj = new CircularQueue(10);

        InterfaceCharQueue interfaceTypeObj;
        InterfaceCharQueue[] queues = {bigQ, smallQ, dynQueueObj, circQueueObj};

        int nr = 1;
        for (InterfaceCharQueue q : queues) {
            System.out.println("\nExample: " + nr);
            interfaceTypeObj = q;
            putMultipleCharacters(interfaceTypeObj, 26);
            getMultipleCharacters(interfaceTypeObj, 26);
            try {
                putAndGetMultipleCharacters(interfaceTypeObj, 26);
            } catch (QueueEmptyException | QueueFullException e) {
                e.printStackTrace();
            }
            nr++;
        }

        QueueFullException myobj = new QueueFullException(7);
        System.out.println("Trying to print object of a class:");
        System.out.println(myobj);
    }

    static void putMultipleCharacters(InterfaceCharQueue obj, int num) {
        System.out.println("\nPutting " + num + " " +
                "characters into " + obj.getClass() + ": ");
        for (int i = 0; i < num; i++) {
            try {
                obj.put((char) ('A' + i));
            } catch (QueueFullException e) {
                e.printStackTrace();
            }
        }
    }

    static void getMultipleCharacters(InterfaceCharQueue obj, int num) {
        System.out.println("\nGetting " + num + " " +
                "characters from " + obj.getClass() + ": ");
        for (int i = 0; i < num; i++) {
            char ch = 0;
            try {
                ch = obj.get();
            } catch (QueueEmptyException e) {
                e.printStackTrace();
            }
            if (ch != (char) 0) System.out.print(ch);
        }
    }

    static void putAndGetMultipleCharacters(InterfaceCharQueue obj, int num) throws QueueFullException, QueueEmptyException {
        System.out.println("\nGetting " + num + " " +
                "characters from " + obj.getClass() + ": ");
        for (int i = 0; i < num; i++) {
            obj.put((char) ('A' + i));
            char ch = obj.get();
            if (ch != (char) 0) System.out.print(ch);
        }
    }
}
