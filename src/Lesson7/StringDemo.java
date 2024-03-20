package Lesson7;

public class StringDemo {
    public static void main(String[] args) {
        String str0 = new String("Hello");
        String str1 = "Hello";
        String myStr0 = "apple";
        String myStr1 = "banana";
        String str2 = new String(str0);
        String complexString = "One two three One";

        for (int i = 0; i < str1.length(); i++) {
            System.out.println("str1.charAt(" + i + "): " + str1.charAt(i));
        }

        System.out.println(str0);
        System.out.println(str1);
        System.out.println(str2);

        System.out.println("EQUALS: " + str0.equals(str2));
        System.out.println("COMPARE TO: " + str0.compareTo(str2));
        System.out.println("COMPARE TO: " + myStr1.compareTo(myStr0));

        System.out.println("Index of first occurrence One: " + complexString.indexOf("One"));
        System.out.println("Index of first occurrence One: " + complexString.lastIndexOf("One"));

        System.out.println("UPPER CASE " + complexString.toUpperCase());
        System.out.println("lower case " + complexString.toLowerCase());

        String upCase = complexString.toUpperCase();
        String lowCase = complexString.toLowerCase();
        System.out.println("EQUALS IGNORE CASE: " + upCase.equals(lowCase));

        System.out.println("str1 length is " + str1.length());
    }
}
