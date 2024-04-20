package day26_statics.studentTasks;

public class Student {

    public String name;
    public int age;
    public char gender;
    public String id;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, char gender) {
        this(name, age);
        this.gender = gender;
    }

    public Student(String name, int age, char gender, String id) {
        this(name, age, gender);
        this.id = id;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                '}';
    }
}
