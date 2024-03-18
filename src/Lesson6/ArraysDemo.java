package Lesson6;

public class ArraysDemo {
    public static void main(String[] args) {

//      тип записи массивов - type arrayName[] = new type[size]

        int sample[] = new int[10];

        for (int i = 0; i < 10; i++)
            sample[i] = i;

        for (int i = 0; i < 10; i++)
            System.out.println("sample[" + i + "]: " + sample[i]);
    }
}
