package day16_nestedLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        String answer = "yes";


        while (answer.equals("yes")) {

            System.out.println("Enter your first number:");
            double num1 = scr.nextDouble();


            System.out.println("Enter the math operator:");
            char o = scr.next().charAt(0);

            while (!(o == '+' || o == '-' || o == '*' || o == '/')) {
                System.err.println("Invalid operator! Please re-enter the math operator");
                o = scr.next().charAt(0);
            }


            System.out.println("Enter your second number:");
            double num2 = scr.nextDouble();

            double result = (o == '+') ? num1 + num2 : (o == '-') ? num1 - num2 : (o == '*') ? num1 * num2 : num1 / num2;

            System.out.println("result = " + result);

            System.out.println("Would you like tı continue? Yes/No");
            answer = scr.next().toLowerCase();

            while ( ! (answer.equals("yes" )|| answer.equals("no"))){
                System.err.println("Invalid Answer! Please re-enter the answer");
                answer = scr.next().toLowerCase();
            }


        }
    }
}
