package day11_StringContinue;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first string:");
        String first = input.nextLine();

        System.out.println("Enter second string:");
        String second = input.nextLine();


        input.close();

        String s = (first.length() > second.length())? (first): (second.length() > first.length())? (second):"Equal";

        System.out.println(s);

    }
}
