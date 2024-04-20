package day06_ifStatements;

public class NumberOfDays {

    public static void main(String[] args) {

        int n = 4;

        boolean has28Days = n == 2,
                has30Days = n == 4 || n == 6 || n == 9 || n == 11,
                has31Days = !has28Days && !has30Days;

        String result = "";

        if (has28Days) result = "28 days.";
        else if (has30Days) result = "30 days.";
        else if (has31Days) result = "31 days.";

        System.out.println(result);


    }

}
