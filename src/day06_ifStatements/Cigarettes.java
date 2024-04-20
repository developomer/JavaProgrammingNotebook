package day06_ifStatements;

public class Cigarettes {

    public static void main(String[] args) {

        int age = 60;

        if (age >= 18 & age <= 50){
            System.out.println("Your age " + age + ". You are eligible to buy cigarettes.");
        }else{
            System.out.println("Your age " + age + ". You are not eligible to buy cigarettes.");
        }



    int age1 = 21;

        if(age1 <= 21){
            System.out.println("Not Eligible");
        }
        if(age1 >= 21){
                System.out.println("Eligible");
        }


    }
}