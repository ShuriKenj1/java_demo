package Lesson9;

public class Block {
    int a, b, c;
    int volume;

    Block(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        volume = a * b * c;
    }

    boolean isSameBlock(Block obj) {
        if ((obj.a == a) & (obj.b == b) & (obj.c == c)) return true;
        else return false;
    }

    boolean isSameVolume(Block obj) {
        if (obj.volume == volume) return true;
        else return false;
    }

    Block createDuplicate(){
        return new Block(a, b, c);
    }
}
