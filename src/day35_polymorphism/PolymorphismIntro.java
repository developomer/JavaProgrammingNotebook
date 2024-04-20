package day35_polymorphism;

import day27_accessModifiers.Car;
import day27_accessModifiers.Circle;
import day33_abstraction.employeeTask.*;
import day34_abstraction.animalTask.*;
import day34_abstraction.carTask.Audi;
import day34_abstraction.carTask.Honda;
import day34_abstraction.carTask.Tesla;

import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", 'M', 4, "Small", "White");

        Cat cat = new Cat("Max", "Husky", 'M', 4, "Small", "White");

        Tiger tiger = null;

        Eagle eagle = null;

        Lion lion = null;

        Parrot parrot = null;

        Dolphin dolphin = null;

        Shark shark = null;

        Duck duck = null;

        Animal[] animals = {dog, cat, tiger, lion, eagle, parrot, dolphin, shark, duck};

        System.out.println("---------------------------------------------------");

        String str = "Java";

        Integer n = 100;

        Boolean r = false;

        Double d = 10.5;

        Circle circle = new Circle(4);

        Honda honda = new Honda("Pilot", "Black", 2019, 35000);

        Audi audi = new Audi("Q6", "Silver", 2020, 36000);

        Tesla tesla = new Tesla("Model Y", "Blue", 2022, 60000);

        Teacher teacher = new Teacher("Samo", "A1" , "JD", 21, 100000, 'M');

        Developer developer = new Developer("HHH", "A2" , "JD", 20, 100000, 'F', "Java");

        Driver driver = new Driver("Samo", "A1" , "JD", 21, 100000, 'M');

        Tester tester = new Tester("Samo", "A1" , "JD", 21, 100000, 'M');


        Object[] objects = {str, n, r, d, circle, honda, audi, tesla, teacher, developer, driver, tester};

        System.out.println(Arrays.toString(objects));

        Object[] employees = {teacher, developer, driver, tester};


        Employee obj = new Driver("Samo", "A1" , "JD", 21, 100000, 'M');
        obj.work();

        System.out.println("-------------------------------------------------------------------------------");



    }


}
