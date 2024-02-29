package Lesson2;

public class ShortHandAndOrSideEffects {
    public  static void main(String[] args) {
        int i;

        i = 0;

        if (false && (++i < 100))
            System.out.println("THIS STRING WON'T BE DISPLAYED");
        System.out.println("The if operator was executed " + i);
    }
}
