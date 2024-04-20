package day12_CustomMethodsIntro;


import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String first = scr.nextLine().trim().replace(" ", "");

        System.out.println("Enter your last name:");
        String last = scr.nextLine().trim().replace(" ", "");

        scr.close();

        first = first.substring(0, 1 ).toUpperCase() + first.substring(1).toLowerCase();
        last = last.substring(0, 1 ).toUpperCase() + last.substring(1).toLowerCase();

        String full_name = first + " " + last;

        System.out.println(full_name);


    }

}
