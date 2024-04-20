package day35_polymorphism;

import day33_abstraction.employeeTask.*;

public class PolymorphismPractice3 {

    public static void main(String[] args) {

        Employee[] employees = {
                new Tester("Hamza", "A01", "QA", 32, 110000, 'M'),
                new Developer("Lucy", "A02", "Java Developer", 27, 128000, 'F', "Java"),
                new Tester("George", "A03", "SDET", 28, 120000, 'M'),
                new Developer("Yulia", "A04", "Software Developer", 23, 135000, 'F', "Python"),
                new Tester("Cihad", "A05", "SDET", 30, 105000, 'M'),
                new Developer("Gulistan", "A06", "Web Developer", 26, 130000, 'F', "Python"),
                new Tester("Nora", "A07", "QE", 28, 120000, 'F'),
                new Driver("Aaron", "D1", "Truck Driver", 48, 90000, 'M'),
                new Developer("Diana", "A08", "Front-end Developer", 29, 140000, 'F', "C#"),
                new Tester("Tatiana", "A09", "SDET", 25, 130000, 'F'),
                new Developer("Alena", "A10", "Back-end Developer", 26, 150000, 'F', "Java"),
                new Tester("Timur", "A11", "SDET", 29, 115000, 'M'),
                new Teacher("James", "B1", "Math Teacher", 45, 75000, 'M'),
                new Developer("Hasan", "A12", "Full Stack Developer", 26, 142000, 'F', "Java"),
                new Tester("Nataliia", "A13", "QE", 24, 125000, 'F'),
                new Developer("Ermek", "A14", "Full Stack Developer", 26, 142000, 'M', "Java"),
                new Tester("Khashayar", "A15", "SDET", 30, 105000, 'M')

        };


        // 1. Print the name and Job Title of every employee
        for (Employee each : employees) {
            System.out.println(each.getName() + " : " + each.getJobTitle());
        }


        System.out.println("-----------------------------------------------------");

        int countDeveloper = 0,
                countTester = 0,
                countDriver = 0,
                countTeacher = 0;

        for (Employee each : employees) {

            if(each instanceof Developer){ // if the employee is Developer
                countDeveloper++;
            }else if(each instanceof Tester){ // if the employee is Tester
                countTester++;
            }else if(each instanceof Teacher){ // if the employee is Teacher
                countTeacher++;
            }else{
                countDriver++;
            }

        }

        System.out.println("countDeveloper = " + countDeveloper);
        System.out.println("countTester = " + countTester);
        System.out.println("countDriver = " + countDriver);
        System.out.println("countTeacher = " + countTeacher);

        System.out.println("--------------------------------------------------------");

        for (Employee each : employees) {
            if( !(each instanceof Developer) ){
                System.out.println(each.getName());
            }
        }


    }


}


/*
   1. Print the name and Job Title of every employee
        2. How many developers do we have?
        3. How many testers do we have?
        4. How many teachers do we have?
        5. How many Drivers do we have?
        6. Display the names of employees who are not developers
 */