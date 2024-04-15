package Lesson14;

public class QueueDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);

        char ch;
        int i;

        System.out.println("Using bigQ to store alphabet values:");
        for (i = 0; i < 26; i++){
            bigQ.put((char)('A' + i));
        }

        for (i = 0; i < 26; i++){
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");
        System.out.println("Using smallQ to store alphabet values:");
        for (i = 0; i < 5; i++){
            smallQ.put((char)('A' + i));
        }

        Queue clonedQ = new Queue(smallQ);

        for (i = 0; i < 5; i++){
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print("\n" + ch);
        }
        System.out.println();

        System.out.println("\n");
        System.out.println("Show clonedQ");
        for (i = 0; i < 5; i++){
            ch = clonedQ.get();
            if (ch != (char) 0) System.out.print("\n" + ch);
        }
        System.out.println();
    }
}
