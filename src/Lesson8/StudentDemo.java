package Lesson8;

public class StudentDemo {
    public static void main(String[] args) {

        Student ITstudent1 = new Student("Kostya", 5);

        ITstudent1.addGrade(0, 1);
        ITstudent1.addGrade(1, 2);
        ITstudent1.addGrade(2, 3);
        ITstudent1.addGrade(3, 4);
        ITstudent1.addGrade(4, 5);

        ITstudent1.avgGradeCalc();

        System.out.println("Average grade of student Kostya: " + ITstudent1.avgGradeCalc());
        System.out.println("Max grade of student Kostya: " + ITstudent1.maxGrade());

    }
}
