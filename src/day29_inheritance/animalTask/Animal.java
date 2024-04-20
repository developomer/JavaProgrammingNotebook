package day29_inheritance.animalTask;

public class Animal {

    private String name, breed, size, color;
    private int age;
    private char gender;

    public static boolean isAnimal;

    static {
        isAnimal = true;
    }

    public void setInfo(String name, int age, char gender, String breed, String size, String color){
        setName(name);
        setAge(age);
        setGender(gender);
        setBreed(breed);
        setSize(size);
        setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public static boolean isIsAnimal() {
        return isAnimal;
    }

    public static void setIsAnimal(boolean isAnimal) {
        Animal.isAnimal = isAnimal;
    }

    public void eat(){
        System.out.println(name + " is eating fish.");
    }
    public void drink(){
        System.out.println(name + " is drinking water.");
    }
    public void sleep(){
        System.out.println(name + " is sleeping everytime.");
    }

    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
