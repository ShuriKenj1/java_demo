package HW.Fifth.SecondTask;

public class GradeCalcProgDemo {
    public static void main(String[] args) {
        GradeCalcProg grade1 = new GradeCalcProg(90);
        GradeCalcProg grade2 = new GradeCalcProg(80);
        GradeCalcProg grade3 = new GradeCalcProg(70);
        GradeCalcProg grade4 = new GradeCalcProg(60);
        GradeCalcProg grade5 = new GradeCalcProg(20);

        grade1.gradeCalc();
        grade2.gradeCalc();
        grade3.gradeCalc();
        grade4.gradeCalc();
        grade5.gradeCalc();
    }
}
