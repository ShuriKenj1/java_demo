package Lesson13;

public interface Series {
    int getNext();
    void reset();
    void setStart(int x);
    default int[] getNextArray(int n){
        int[] values = new int[n];
        for (int i = 0; i < n; i++) values[i] = getNext();
        return values;
    }
}