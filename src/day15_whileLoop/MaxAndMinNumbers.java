package day15_whileLoop;

import java.util.Scanner;

public class MaxAndMinNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int num = scanner.nextInt();

            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }


        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }



}
