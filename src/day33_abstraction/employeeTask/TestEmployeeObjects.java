package day33_abstraction.employeeTask;

public class TestEmployeeObjects {

    public static void main(String[] args) {

       // Employee employee = new Employee("Samo", "A1" , "JD", 21, 100000, 'M');
        // We can not create objects from an abstract class, Object MUST be created from  a concrete class

        Teacher teacher = new Teacher("Samo", "A1" , "JD", 21, 100000, 'M');

        Developer developer = new Developer("HHH", "A2" , "JD", 20, 100000, 'F', "Java");

        Driver driver = new Driver("Samo", "A1" , "JD", 21, 100000, 'M');

        Tester tester = new Tester("Samo", "A1" , "JD", 21, 100000, 'M');

        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(tester);
        System.out.println(driver);

        System.out.println("-----------------------------------------------------------");

        teacher.work();
        developer.work();
        tester.work();
        driver.work();

    }

}
