package day17_customClass;

public class TestDogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Type";
        dog1.breed = "Husky";
        dog1.gender = 'M';
        dog1.age = 4;
        dog1.size = "Small";
        dog1.color = "White";

        dog1.eat();
        dog1.drink();

        Dog dog2 = new Dog();
        dog2.name = "Will";
        dog2.breed = "Witcher";
        dog2.gender = 'F';
        dog2.age = 4;
        dog2.size = "Small";
        dog2.color = "Black";

        Dog dog3 = new Dog();
        dog3.setInfo("Loki" ,"Chow chow", 'M', 3, "Medium", "Black");

        Dog dog4 = new Dog();
        dog4.setInfo("Chuck", "Bulldog", 'M', 5, "Small", "White");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);


        dog3.eat();

        dog2.drink();


    }

}
