package day13_customMethods;

public class ReturnStatement {
    public static void main(String[] args) {

    eligible(25);
        System.out.println("-----------------------------");


        System.out.println("Test 1 Started");

        boolean exit = true;

        if (exit){
            return; // main method g ets terminated
         //   System.out.println("Hello World");
        }

        System.out.println("Test 1 Completed");

        System.out.println("Test 2 Started");








    }



    public static void eligible(int age) {

        if (age < 0 || age > 150) {
            System.err.println("Invalid age: " + age);
            return; // exits the method
            // if the age is invalid, then the gets terminated
        }
        if (age >= 21) {
            System.out.println("You are eligible to buy alcohol");
        }else {
            System.out.println("You are not eligible to buy alcohol");
        }
    }

    public static int multiplication(int n1, int n2){

        int result = n1 * n2 ;

        return result;  // returns the value when exiting the method

        //     System.out.println("Hello");

    }

}
