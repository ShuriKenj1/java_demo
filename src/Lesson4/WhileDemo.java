package Lesson4;

public class WhileDemo {
    public static void main(String[] args) {
//    while (condition) operator {
//        some code
//    }
        char ch;

        ch = 'a';

        while (ch <= 'z') {
            System.out.println(ch);
            ch++;
        }
//        одинаковая функция и поведение
        for (ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch);
        }

        int e;
        int result;

        for (int i = 0; i < 10; i++) {
            result = 1;
            e = i;

             while  (e > 0) {
                 result *= 2;
                 e--;
             }

            System.out.println("2 in the power " + i + " is equal to " + result);
        }
    }
}
