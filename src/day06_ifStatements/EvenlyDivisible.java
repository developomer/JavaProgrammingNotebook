package day06_ifStatements;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 35;

        boolean isDivisible2 = number % 2 == 0,
                isDivisible3 = number % 3 == 0,
                isDivisible5 = number % 5 == 0,
                isDivisible6 = isDivisible2 && isDivisible3;
        System.out.println(number + " is divisible 2: " + isDivisible2);
        System.out.println(number + " is divisible 3: " + isDivisible3);
        System.out.println(number + " is divisible 5: " + isDivisible5);
    }
}
