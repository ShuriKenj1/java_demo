package Lesson17;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        HashMap<Book, Patient> hospitalLibrary = new HashMap<>();
        HashMap<Integer, String> inputLibrary = new HashMap<>();

        Book a = new Book("smth", "smbd", (short) 1900);
        Book b = new Book("Путешествие в Икстлан", "Карлос Кастанеда", (short) 2039);
        Book c = new Book("Plague", "Albert Kamyu", (short) 1375);
        Book d = new Book("O brave new world", "Aldous Huxley", (short) 4212);
        Book e = new Book("Procrastinating", "JoJo", (short) 1590);

        List<Book> list = Arrays.asList(a, b, c, d, e);

        Patient newPatient0 = new Patient("James", 1, Severity.LOW);
        Patient newPatient1 = new Patient("John", 45, Severity.MEDIUM);
        Patient newPatient2 = new Patient("Jimbo", 44, Severity.MEDIUM);
        Patient newPatient3 = new Patient("Johny", 1, Severity.HIGH);
        Patient newPatient4 = new Patient("Jinx", 45, Severity. HIGH);

        List<Patient> listOfPatients = Arrays.asList(newPatient0, newPatient1, newPatient2, newPatient3, newPatient4);

        for (int i = 0; i < list.size() && i < listOfPatients.size(); i++){
            hospitalLibrary.put(list.get(i), listOfPatients.get(i));
        }

        for (Book i : hospitalLibrary.keySet()){
            System.out.println("Key: " + i + ";\n\tValue: " + hospitalLibrary.get(i));
        }

//        capitalCities.put("England", "London");
//        capitalCities.put("Germany", "Berlin");
//        capitalCities.put("Norway", "Oslo");
//        capitalCities.put("USA", "Washington DC");
//        System.out.println(capitalCities.size());
////        capitalCities.clear();
//
//        System.out.println(capitalCities);
//
//        System.out.println(capitalCities.get("England"));
//        System.out.println(capitalCities.remove("England"));
//        System.out.println(capitalCities);
//
//        for (String i: capitalCities.keySet()) {
//            System.out.println(i);
//        }
//        for (String i: capitalCities.values()) {
//            System.out.println(i);
//        }
//        for (String i: capitalCities.keySet()) {
//            System.out.println("Key: " + i + "; Value: " + capitalCities.get(i));
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter keys and values (enter '.' to stop):");
        boolean stop = false;

//        System.out.println("Enter how many pairs you want to add");
//        Integer number = scanner.nextInt();

//        for (;number > 0; number--) {
            while (!stop) {
            System.out.println("Enter key");
            Integer key = scanner.nextInt();

            System.out.println("Enter value");
            Scanner in = new Scanner(System.in);
            String value = in.nextLine();
            for (int i = 0; i < value.length(); i++){
                char inputChar = value.charAt(i);

                if (inputChar == '.') {
                    stop = true;
                    break;
                }
            }
                inputLibrary.put(key, value.replace(".", ""));
            }

        for (Integer i: inputLibrary.keySet()) {
            System.out.println("Key: " + i + "; Value: " + inputLibrary.get(i));
        }
    }
}
