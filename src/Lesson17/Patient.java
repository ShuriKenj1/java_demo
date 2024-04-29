package Lesson17;

public class Patient implements Comparable<Patient>{

    private String name;
    private int age;
    private Severity severity;

    Patient(String name, int age, Severity severity){
        this.name = name;
        this.age = age;
        this.severity = severity;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getSeverityScore() {
        return severity.getScore();
    }
    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", severity=" + severity +
                '}';
    }

    @Override
    public int compareTo(Patient o) {
        if (getSeverityScore() > o.getSeverityScore()) return 1;
        else if (getSeverityScore() < o.getSeverityScore()) return -1;
//            else if (getAge() > o.getAge()) return 1;
//            else if (getAge() < o.getAge()) return -1;
        return 0;
    }
}
