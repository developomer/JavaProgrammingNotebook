package day33_abstraction.employeeTask;

public class Teacher extends Employee{


    public Teacher(String name, String id, String jobTitle, int age, int salary, char gender) {
        super(name, id, jobTitle, age, salary, gender);
    }

    public void work() {
        System.out.println(getName() + " is working.");
    }
}
