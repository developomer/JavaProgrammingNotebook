package day24_dateAndTime;

import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate birthday;

    public void setInfo(String name, char gender, LocalDate birthday) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        age = LocalDate.now().getYear() - birthday.getYear();
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", birthday=" + birthday +
                '}';
    }
}
