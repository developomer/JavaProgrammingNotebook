package day12_CustomMethodsIntro;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        int number = 300;

        CustomMethodsWithParameter.oddOrEven(300);
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine(),
                lastName = scanner.nextLine();

        CustomMethodsPractice.initial(firstName, lastName);
    }
}
