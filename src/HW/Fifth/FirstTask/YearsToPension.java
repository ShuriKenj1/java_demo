package HW.Fifth.FirstTask;

public class YearsToPension{
    int age;
    char gender;
    String name;

    YearsToPension(String name, int age, char gender){
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    void retirementCalc(){
        if (gender == 'M'){
            if (age >= 70){
                System.out.println(name + " has retired " + (age - 70) + " years ago.");
            } else {
                System.out.println(name + " has "  + (70 - age) + " years until retirement.");
            }
        } else if (gender == 'W'){
            if (age >= 65){
                System.out.println(name + " has retired " + (age - 65) + " years ago.");
            } else {
                System.out.println(name + " has "  + (65 - age) + " years until retirement.");
            }
        }
    }
}
