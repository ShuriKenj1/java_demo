package Lesson12;

import Lesson6.ArrayUtils;
import com.sun.source.tree.BreakTree;

import java.util.Random;
import java.util.Scanner;

// класс для генерации рандомных цифр (в том числе для TicTacToe с рандомным ботом)
public class RandomNumbers{
    public static void main(String[] args) {

        // 1. способ генерации рандомных чисел
        int min = 10;
        int max = 100;
        int randomNum = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println(randomNum);

//  --------------------------------------------------------------------
        Random randGen = new Random();

        int randomNum1 = randGen.nextInt();
        int randomNum2 = randGen.nextInt(max - min + 1) + min;
        System.out.println(randomNum1);
        System.out.println(randomNum2);

//  --------------------------------------------------------------------

    }
    static int[] setValuesRandom(int[] array, int min, int max) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(max * min + 1) + min;
        }
        return array;
    }

    static int[] setValuesMathRandom(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max * min + 1) + min);
            // Math.random() возвращает изначально double,
            // поэтому мы его приводим к (int)
        }
        return array;
    }

    static int[] orderArray (){
        System.out.println("Enter array size: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int[] array = new int[Math.abs(size)];

        System.out.println("Enter range from:");
        int min = in.nextInt();

        System.out.println("Enter range to:");
        int max = in.nextInt();

        if (max < min) {
            int t = max;
            max = min;
            min = t;
        }
        return setValuesMathRandom(array, min, max);
    }
}
