package Lesson16;

public class FixedQueue implements InterfaceCharQueue{

    private char[] q;
    private int putloc, getloc;

    FixedQueue(int size){
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    FixedQueue(FixedQueue obj){
        putloc = obj.putloc;
        getloc = obj.getloc;
        q = new char[obj.q.length];

        for (int i = getloc + 1; i <= putloc; i++){
            q[i] = obj.q[i];
        }
    }

    public void put(char ch) throws QueueFullException {
        if (putloc == q.length - 1){
            throw new QueueFullException(q.length - 1);
        }
        putloc++;
        q[putloc] = ch;
    }

    public char get() throws QueueEmptyException {
        if (getloc == putloc){
            throw new QueueEmptyException(q.length - 1);
        }
        getloc++;
        return q[getloc];
    }
}
