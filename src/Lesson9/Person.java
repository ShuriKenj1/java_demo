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
}
