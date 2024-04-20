package day29_inheritance.animalTask;

public class Zoo{

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", 4, 'M', "Husky", "Large", "White");

        Cat cat = new Cat();
        cat.setInfo("Felicia", 3, 'F', "stray", "Medium", "Black and White");

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", 5,  'M', "Bengal", "Large", "Orange");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("---------------------------------------------------");

        dog.eat();
        dog.sleep();
        dog.drink();

        cat.eat();
        cat.drink();
        cat.sleep();

        tiger.eat();
        tiger.drink();
        tiger.sleep();

        System.out.println("---------------------------------------------------");

        dog.bark();
        //  cat.bark();
        //    tiger.bark();


        cat.meow();
        //   dog.meow();
        //    tiger.meow();

        tiger.hunt();
        //  dog.hunt();
        //   cat.hunt();

        System.out.println("---------------------------------------------------");
/*
        System.out.println(dog.name);
        System.out.println(dog.color);

        dog.gender = 'K';
        dog.age = -100;
*/

}
}
