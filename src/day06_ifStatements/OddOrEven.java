package day06_ifStatements;

public class OddOrEven {

    public static void main(String[] args) {

/*int number = -4;
        String result = "";

        if (number > 0){
        if (number%2 == 0){
            result = number +" is an even number: true";
        }else {
            result = number +" is an odd number: false";
        }
    }
        System.out.println(result);*/

        int number = 46;

        boolean isEven = number % 2 == 0;

        boolean isOdd = !isEven; // boolean isOdd = number % 2 != 0;

        System.out.println(number + " is even number: " + isEven);
        System.out.println(number + " is odd number: " + isOdd);





    }
}
