package HW.Fifth.ThirdTask;

public class StudGrCalc {
    double avg;
    int sumOfGrades = 0;
    int students;
    int grades;
    int[][] group;

    StudGrCalc(int s, int g) {
        this.students = s;
        this.grades = g;
        group = new int[s][g];

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < g; j++) {
                group[i][j] = (int) (Math.random() * g) + 1; // работает!! :-) ❤
                sumOfGrades += group[i][j]; // и это тоже работает!
            }
        }
        for (int i = 0; i < s; i++) {
            System.out.println("\nStudents " + (i + 1) + " grades: ");
            for (int j = 0; j < g; j++) {
                System.out.print(group[i][j] + " ");
            }
        }
    }

    void avgGroupCalc(){
        System.out.println("\n---------------------------------------");
        avg = (double) sumOfGrades / (grades * students);
        System.out.println("Average grade in the group is " + avg);
    }
}