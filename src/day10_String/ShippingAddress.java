package day10_String;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String full_name = input.nextLine();

        System.out.println("Enter your building number:");
        int buildNumber = input.nextInt();

        input.nextLine();

        System.out.println("Enter your Street name:");
        String streetName = input.nextLine();

        System.out.println("Enter your city name:");
        String city_name = input.nextLine();

        System.out.println("Enter your state:");
        String state = input.nextLine();

        System.out.println("Enter your zip code:");
        int zip_code = input.nextInt();



        System.out.println("Your shipping address is:\n\t"+full_name+ "\n\t"+buildNumber+" "+streetName+"\n\t"+city_name+", "+state+" "+zip_code);
        input.close();
    }
}
