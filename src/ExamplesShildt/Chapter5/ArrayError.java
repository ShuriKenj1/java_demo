package ExamplesShildt.Chapter5;

public class ArrayError {
    public static void main(String[] args) {
        int sample[] = new int[10];
        int i;

        // Искуссвтенно создать выход индекса за границы массива
        for (i = 0; i < 100; i++){
            sample[i] = i;
        }
    }
}
