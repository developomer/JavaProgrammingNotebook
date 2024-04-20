package day31_inheritance.animal_methodOverriding;

public class Lion extends Animal {

    private boolean isAfricanLion;

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfricanLion) {
        super(name, breed, gender, age, size, color);
        setAfricanLion(isAfricanLion);
    }

    public void eat() {
        System.out.println("Lion " + getName() + " is eating deer");
    }

    public void roar() {
        System.out.println("Lion " + getName() + " is roaring");
    }

    public String toString() {
        return super.toString().replace("}", "") +
                ", African lion='" + isAfricanLion + '\'' +
                '}';
    }
}