package day09_Scanner;

import java.util.Scanner;
// import java.util.*;


public class ScannerIntro {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in); // for reading user inputs


        System.out.println("Enter your first number: ");
        byte num1 = input.nextByte(); //   -128 ~ 127

        System.out.println("Enter your second number: ");
        short num2 = input.nextShort();

        System.out.println("Enter your third number: ");
        int num3 = input.nextInt();


        input.close();




        System.out.println("First number: "+num1);
        System.out.println("Second number: "+num2);
        System.out.println("Third number: "+num3);







    }
}
