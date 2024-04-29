package Lesson17;

public enum Severity {

    CRITICAL(1), HIGH(2), MEDIUM(3), LOW(4);

    private int score;

    Severity(int i) {
        score = i;
    }

    int getScore(){
        return score;
    }
}