package day05_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        int a = 1000,
                b = 200;

        // System.out.println( a > b );

        boolean nıcely = a > b;

        System.out.println("nıcely " + nıcely);

        System.out.println("---------------------------------");

        int score = 75;

        boolean passed = score >= 60;

        System.out.println(passed);

        System.out.println("----------------------------------");

        score = 48;

        boolean failed = score < 60;

        System.out.println(failed);

    }

}
