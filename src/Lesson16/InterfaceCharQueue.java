package Lesson16;

public interface InterfaceCharQueue {
    void put(char ch) throws QueueFullException;
    char get() throws QueueEmptyException;
}