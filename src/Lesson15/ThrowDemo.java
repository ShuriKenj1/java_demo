package Lesson15;

public class ThrowDemo {
    public static void main(String[] args) {
        try {
            System.out.println("BEFORE THROW");
            throw new ArithmeticException();
        } catch (ArithmeticException exc){
            System.out.println("The ArithmeticException was caught");
            throw exc;
        } finally {
            System.out.println("This will be printed? - Yes, no matter if exception will happen");
        }
    }
}
