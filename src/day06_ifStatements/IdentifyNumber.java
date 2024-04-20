package day06_ifStatements;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number = -20;

        boolean isPositive = number > 0;
        boolean isNegative = number < 0;

        boolean isZero = number == 0; // = !isPositive && !isNegative

        System.out.println(number + "isPositive = " + isPositive);
        System.out.println(number + "isNegative = " + isNegative);
        System.out.println(number + "isZero = " + isZero);


    }
}
