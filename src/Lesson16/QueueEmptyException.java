package Lesson16;

public class QueueEmptyException extends Exception{
    int size;

    QueueEmptyException(int s){
        size = s;
    }

    public String toString() {
        return "\nThe queue is empty.";
    }
}
