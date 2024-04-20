package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {

        Person person = new Person("Zülkarneyn", 'M', LocalDate.of(1000,1,1));

        System.out.println(person);

        System.out.println("--------------------------------------------------------------------");

        Employee employee = new Employee("Elay", 'F', LocalDate.of(1935, 3,4), "History", 2);

        System.out.println(employee);

        employee.breath();


    }



}
