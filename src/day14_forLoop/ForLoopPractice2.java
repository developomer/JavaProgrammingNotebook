package day14_forLoop;

import java.util.Scanner;

public class ForLoopPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

 /*       int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            sum += input.nextInt();
        }

        System.out.println("sum = " + sum);
*/

        System.out.println("----------------------------------------");

        // write a program that can ask the user enter to enter a number for five times,  print the maximum

        System.out.print("Enter a number 1: ");
        int max = input.nextInt();

        for (int i = 2; i <= 5; i++) {
            System.out.print("Enter a number " + i + ": ");
            int number = input.nextInt();

            if (number > max){
                max = number;
            }

        }
        System.out.println("Max number is: " + max);


        System.out.println("-----------------------------------------");




        System.out.print("Enter a number 1: ");
        int min = input.nextInt();

        for (int i = 2; i <= 5; i++) {
            System.out.print("Enter a number " + i + ": ");
            int number = input.nextInt();

            if (number < min){
                min = number;
            }
        input.close();
        }
        System.out.println("Min number is: " + min);



    }
}
