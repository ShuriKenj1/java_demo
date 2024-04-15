package Lesson13;

public class ByFives implements Series{
    int start;
    int val;

    ByFives(){
        start = 0;
        val = 0;
    }

    @Override
    public int getNext() {
        val += 5;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
    }
}
