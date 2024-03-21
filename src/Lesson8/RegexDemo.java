package Lesson8;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("stepit", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Welcome to StepIT");

        boolean matchFound = matcher.find();

        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "aRun32"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "aRun%2"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "aRun32traq"));
        System.out.println(Pattern.matches("[789]\\d{9}", "9465432381"));
        System.out.println(Pattern.matches("[789]{2}\\d{9}", "98123456789"));

        String EXAMPLE_TEXT = "This is an example of a text . please check if it got corrected . here !";

        String pattern1 = "(\\w)(\\s+)([\\.,\\?!;:])";

        String modifiedString = EXAMPLE_TEXT.replaceAll(pattern1, "$1$3");

        System.out.println(modifiedString);

        String EXAMPLE_TEXT_1 = "This is my smol example of a string" +
                " which I'm going to use for a pattern matching";

        System.out.println("Is this string not empty? - " + EXAMPLE_TEXT_1.matches("\\w.+"));
        System.out.println("Is this string not empty? - " + (EXAMPLE_TEXT_1.length() > 0));

        String[] splitString = EXAMPLE_TEXT_1.split("\\s+");

        System.out.println("Number of substrings after splitting: " + splitString.length);

        for (String substring : splitString) {
            System.out.println(substring);
        }

        System.out.println(EXAMPLE_TEXT_1.replaceAll("\\s+", "\t"));
    }
}
