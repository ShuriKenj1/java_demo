package Lesson17;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        Queue<Book> library = new PriorityQueue<>();

        Book a = new Book("smth", "smbd", (short) 1900);
        Book b = new Book("Путешествие в Икстлан", "Карлос Кастанеда", (short) 2039);
        Book c = new Book("Plague", "Albert Kamyu", (short) 1375);
        Book d = new Book("O brave new world", "Aldous Huxley", (short) 4212);
        Book e = new Book("Procrastinating", "JoJo", (short) 1590);

        List<Book> list = Arrays.asList(b, c, d, e);

        library.addAll(list);

        System.out.println(library.peek());

//        ---------------------------------------------

        Patient newPatient0 = new Patient("James", 1, Severity.LOW);
        Patient newPatient1 = new Patient("John", 45, Severity.MEDIUM);
        Patient newPatient2 = new Patient("Jimbo", 44, Severity.MEDIUM);
        Patient newPatient3 = new Patient("Johny", 1, Severity.HIGH);
        Patient newPatient4 = new Patient("Jinx", 45, Severity. HIGH);

        List<Patient> listOfPatients = Arrays.asList(newPatient0, newPatient1, newPatient2, newPatient3, newPatient4);

        Comparator<Patient> ageComparator = Comparator.comparing(Patient::getAge);
        Comparator<Patient> severityComparator = Comparator.comparing(Patient::getSeverityScore);
        Queue<Patient> hospitalQueueByAge = new PriorityQueue<>(ageComparator);
        Queue<Patient> hospitalQueueBySeverity = new PriorityQueue<>(severityComparator);
        hospitalQueueByAge.addAll(listOfPatients);
        hospitalQueueBySeverity.addAll(listOfPatients);
        System.out.println("hospitalQueueByAge.peek(): " + hospitalQueueByAge.peek());
        System.out.println("hospitalQueueBySeverity.peek(): " + hospitalQueueBySeverity.peek());

        System.out.println("\nhospitalQueueByAge ORDER:");
        Iterator<Patient> it = hospitalQueueByAge.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nhospitalQueueBySeverity ORDER:");
        Iterator<Patient> it1 = hospitalQueueBySeverity.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
    }
}