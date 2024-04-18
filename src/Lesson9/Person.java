package Lesson9;

import java.util.Scanner;

public class Person {

    public String name;
    private int age;
    protected String password;

    Person(String name, int age) {
        this.name = name;
        this.age = age < 18 ? 0 : age;
        Scanner in = new Scanner(System.in);
        System.out.println("Set you password:");
        password = in.nextLine();
    }

    public void setAge(int age) {
        System.out.println("Enter your password first: ");
        Scanner in = new Scanner(System.in);
        String password = in.nextLine();
        if (password.equals(this.password))
            this.age = age < 18 ? 0 : age;
        else System.out.println("Wrong password! Age has not been modified");
    }

    public int getAge(){
        return age;
    }

    private String getName(String password) throws IllegalAccessException {
        if (password.equals(this.password))
            return name;
        else
            throw new IllegalAccessException();
    }

    public void requestPersonalInfo(){
        System.out.println("Enter password: ");
        Scanner in = new Scanner(System.in);
        String passwordCandidate = in.nextLine();
        try {
            System.out.println(getName(passwordCandidate));
            System.out.println(getName(passwordCandidate));
            System.out.println(getName(passwordCandidate));
        } catch (IllegalAccessException e) {
//           logging security violation event
            System.out.println("The password is incorrect. No personal info will be provided.");
        }
    }
}