package day12_CustomMethodsIntro;

public class CustomMethodsPractice {

    public static void main(String[] args) {


        maxNum(0, 0);


        initial("", "");


    }

    public static void maxNum(double num1, double num2) {


        if (num1 > num2) {
            System.out.println(num1 + " is the maximum number");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the maximum number");
        } else {
            System.out.println("Equal");
        }


    }

    public static void initial(String firstName, String lastName) {


        String initial = firstName.charAt(0) + "." + lastName.charAt(0);

        System.out.println("initial = " + initial);
    }
}
