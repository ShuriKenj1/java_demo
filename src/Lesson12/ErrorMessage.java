package Lesson12;

public class ErrorMessage {

    static final int OUTERR = 0;
    final int INERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;

    String msgs[] = {
            "Output error",
            "Input error",
            "Disk storage exceeded",
            "Out of range index error"
    };

    String getErrorMessage(int i){
        if (i >= 0 & i < msgs.length)
            return msgs[i];
        else
            return "Nonexistent error code";
    }
}
