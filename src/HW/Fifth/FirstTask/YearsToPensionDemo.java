package HW.Fifth.FirstTask;

public class YearsToPensionDemo {
    public static void main(String[] args) {
        YearsToPension human1 = new YearsToPension("Alex",76,'M');
        human1.retirementCalc();

        YearsToPension human2 = new YearsToPension("Max",51,'M');
        human2.retirementCalc();

        YearsToPension human3 = new YearsToPension("Viorica",89,'W');
        human3.retirementCalc();

        YearsToPension human4 = new YearsToPension("Viorica",35,'W');
        human4.retirementCalc();
    }
}
