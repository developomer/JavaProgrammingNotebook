package day13_customMethods;

import java.util.Scanner;

public class WarmupTasks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       /* calculate(45, 5, '/');
        calculate(3456, 234512, '*');

        System.out.println("-----------------------------");


        System.out.println("Enter your two numbers and a math operator:");
        double n1 = input.nextDouble(),
                n2 = input.nextDouble();

        char operator = input.next().charAt(0);

     calculate(n1, n2, operator); */

        System.out.println("-------------------------------");
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        ageGroup(age);

        System.out.println("--------------------------------");

        int age1 = input.nextInt();
        boolean tof = input.nextBoolean();

        eligibleToVote(age1, tof);



    }

    public static void  calculate(double num1, double num2, char mathOperator){

        switch (mathOperator){

            case '+':
                System.out.println(num1 + " " +mathOperator+ num2+" = "+ (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " " +mathOperator+ num2+" = "+ (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " " +mathOperator+ num2+" = "+ (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " " +mathOperator+ num2+" = "+ (num1 / num2));
                break;
            default:
                System.err.println("Invalid operator: "+ mathOperator);
        }



    }

    public static void ageGroup(int age) {

        if (age > 0 && age <= 110) {

            System.out.println( (age < 21)? "Teenager": (age < 55)? "Adult":"Senior");

        }else {
            System.out.println("Invalid age: "+ age);
        }




    }

    public static void eligibleToVote(int age, boolean isAmerican){

            if (age >= 18 && isAmerican){
                System.out.println("Your are eligible the vote :)");
            }else {
                System.err.println("Your are not eligible the vote :(");
            }

    }

}
