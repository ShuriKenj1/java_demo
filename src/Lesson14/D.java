package Lesson14;

public interface D {
    int getUserID();
    default int getAdminID(){
        return 1;
    }
    static int getUniversalID(){ return 0; }
}
