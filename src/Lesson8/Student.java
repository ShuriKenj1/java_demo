package Lesson8;

public class Student {
    String name;
    int[] grades;

    Student(String name, int gradesNum) {
        this.name = name;
        if (gradesNum > 0)
            grades = new int[gradesNum];
        else grades = new int[1];
    }

    public void addGrade(int index, int grade) {
        if (index >= 0 && index < grades.length)
            grades[index] = grade;
        else System.out.println("Warning! Incorrect operation status.");
    }

    float avgGradeCalc() {
        int sum = 0;
        float avg;
        int gradeQuantity = 0;
        for (int x : grades) {
            if (x > 0) gradeQuantity++;
            sum += x;
        }
        avg = (float) sum / gradeQuantity;

        return avg;
    }

    int maxGrade() {
        int max;

        max = grades[0];

        for (int i = 1; grades.length > 1 && i < grades.length; i++) {
            if (grades[i] > max) max = grades[i];
        }
        return max;
    }
}
