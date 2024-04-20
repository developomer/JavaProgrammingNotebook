package day33_abstraction.employeeTask;

public class Tester extends Employee {

    public Tester(String name, String id, String jobTitle, int age, int salary, char gender) {
        super(name, id, jobTitle, age, salary, gender);
    }

    public void work() {
        System.out.println(getName() +" is testing the application");
    }
}