package day18_garbageCollection;

public class TestPizza {

    public static void main(String[] args) {

    Pizza mozart = new Pizza();
    mozart.size = 'l';
    mozart.numberOfPepperoniTopping = 4;
        System.out.println(mozart);

    Pizza dave = new Pizza();
    dave.setInfo('M', 3, 3);
        System.out.println(dave);

    System.out.println("--------------------");

    double total = 0;

    for (int i = 0; i < 20; i++) {

        Pizza small = new Pizza();
        small.setInfo('S', 2, 2);
        total += small.calcCost();

        Pizza medium = new Pizza();
        medium.setInfo('M', 3, 4);
        total += medium.calcCost();

        Pizza large = new Pizza();
        large.setInfo('L', 4, 5);
        total += large.calcCost();

    }

        System.out.println("total = " + total);

    }
}
