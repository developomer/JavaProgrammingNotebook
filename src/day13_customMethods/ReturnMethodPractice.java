package day13_customMethods;

public class ReturnMethodPractice {

    public static void main(String[] args) {




    }

    public static boolean idOdd(int num) {
        return (num % 2 != 0)? true : false;
      /*  if (num % 2 != 0){
            return true;
        }
            return false;*/

    }

    public static boolean isEven(int num){
        return !idOdd(num);
    }

    public static int max(int n1, int n2){
        return n1 > n2 ? n1 : n2;
    }

}



/*
Create a method named isOdd, that can return true if a number is an odd number

Create a method named isEven, that can return true if a number is an even number

Create a method named max, that can return the maximum number between two numbers

Create a method named min, that can return the minimum number between two numbers

 */