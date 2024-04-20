package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {

    public static void main(String[] args) {


        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};
        people[0].setInfo("Ömer", 'M', LocalDate.of(2003, 8, 7));

        ArrayList<Person> studentsList = new ArrayList<>();

        studentsList.addAll(Arrays.asList(people));

        //  print name & date of birthday of each person object

        //  remove all the person object that has the age > 55







    }

}
