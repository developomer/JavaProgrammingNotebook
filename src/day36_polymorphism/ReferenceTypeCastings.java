package day36_polymorphism;

import day29_inheritance.animalTask.Animal;
import day29_inheritance.animalTask.Cat;
import day29_inheritance.animalTask.Dog;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day33_abstraction.employeeTask.*;
import day34_abstraction.carTask.Tesla;
import day35_polymorphism.transpotationTask.AutoPilot;
import day35_polymorphism.transpotationTask.Electric;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        Dog dog = new Dog();

       //  Cat cat = new Dog();

        Animal animal = (Animal) new Dog();

        System.out.println("----------------------------------");

        Animal animal1 = new Dog();
        animal1.setInfo("Max", 4, 'M', "Husky", "Large", "White");

        animal1.eat();
        animal1.drink();
        animal1.sleep();

        ( (Dog)animal1 ).bark();

       // Dog dog1 = new (Dog)animal1; // Down casting
       // dog1.bark();

       // ((Cat)animal1 ).scratch(); // Dog can not be converted to Cat, because there is not "IS A" relationship between dog and cat

        System.out.println("-------------------------------------------");

        Phone phone = new Nokia("XR23", "Small", "Blue", 353);

        phone.call(112);
        phone.text(34241);
        ( (Nokia)phone ).selfDefense(); // Nokia can not be converted to Iphone, because there is not "IS A" relationship between Nokia and Iphone

        //    ( (IPhone)phone ).faceTime(123456); // Nokia can not be converted to Iphone, because there is not "IS A" relationship between Nokia and Iphone

        System.out.println("-------------------------------------------------------------");

        Employee employee = new Developer("HHH", "A2" , "JD", 20, 100000, 'F', "Java");

        employee.work();

        System.out.println(((Developer) employee).getProgrammingLanguage());


        //    Driver driver = (Driver) employee;


        System.out.println("-------------------------------------------------------------");

        Electric electric = (Electric) new Tesla("Pilot", "Black", 2019, 35000);

        electric.charge();
        ((Tesla)electric).selfDrive();
        ( (AutoPilot)electric ).selfDrive();


        System.out.println("-------------------------------------------------------------");

        Employee employee1 = new Teacher("Samo", "A1" , "JD", 21, 100000, 'M');

        Employee employee2 = new Developer("HHH", "A2" , "JD", 20, 100000, 'F', "Java");

        Employee employee3 = new Driver("Samo", "A1" , "JD", 21, 100000, 'M');

        Employee employee4 = new Tester("Samo", "A1" , "JD", 21, 100000, 'M');

        employee1.work();
        employee2.work();
        employee3.work();
        employee4.work();

    }

}
