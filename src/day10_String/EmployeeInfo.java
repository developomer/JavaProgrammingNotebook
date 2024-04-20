package day10_String;

import java.util.Scanner;

public class EmployeeInfo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String full_name = input.nextLine();

        System.out.println("Enter your age:");
        byte age = input.nextByte();

        System.out.println("Enter your gender:");
        char gender = input.next().charAt(0);

        input.nextLine();

        System.out.println("Enter your company name:");
        String company_name = input.nextLine();

        System.out.println("Enter your job title:");
        String job_title = input.nextLine();

        System.out.println("Enter your salary:");
        double salary = input.nextDouble();

        System.out.println("name: "+full_name);
        System.out.println("age: "+age);
        System.out.println("gender: "+gender);
        System.out.println("Company name: "+company_name);
        System.out.println("job title: "+job_title);
        System.out.println("salary: $"+salary);

    }
}
