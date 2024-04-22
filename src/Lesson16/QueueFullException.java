package Lesson16;

public class QueueFullException extends Exception{
    int size;

    QueueFullException(int s){
        size = s;
    }

    public String toString(){
        return "\nThe queue is full. Maximum queue size is " + size;
    }
}
