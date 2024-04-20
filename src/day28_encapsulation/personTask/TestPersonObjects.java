package day28_encapsulation.personTask;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Enes", 20, 'M',"English");

        Person person2 = new Person("Ensar", 19);

        Person person3 = new Person("Hüseyin", "Turkish");

        Person.printPlanetName();

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        person1.drink("Water");
        person1.eat("Hurma");
        Person.planet = "Moon";

        Person.printPlanetName();

    }

}
