package Lesson17;

import java.util.LinkedList;

public class LimitedLinkedList<E> extends LinkedList<E> {
    private final int maxSize;

    public LimitedLinkedList(int maxSize) {
        super();
        this.maxSize = maxSize;
    }

    public boolean offerFirst(E e){
        if (size() + 1 > maxSize) {
            return false;
        }
        add(e);
        return true;
    }
}
