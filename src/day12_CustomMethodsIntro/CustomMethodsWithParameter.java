package day12_CustomMethodsIntro;

public class CustomMethodsWithParameter {

    public static void main(String[] args) {

        int num1 = 100,
            num2 = 35,
            num3 = 79;
        oddOrEven(num1);
        oddOrEven(num2);
        oddOrEven(num3);

    }

    public static void oddOrEven(int number){

    if (number % 2 == 0){
        System.out.println(number + " is even number");
    }else {
        System.out.println(number + " is odd number");
    }



    }


}
