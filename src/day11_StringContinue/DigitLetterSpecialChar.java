package day11_StringContinue;

import java.util.Scanner;

public class DigitLetterSpecialChar {

    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine();

        if (str.length() >= 1){

            char f = str.charAt(0);
            if (f >= 1 && f <= 9){
                System.out.println("first character is digit");
            } else if (f >= 'A' && f <= 'Z') {
                System.out.println("first character is lowercase letter");
            } else if (f >= 'a' && f <= 'z') {
                System.out.println("first character is uppercase letter");
            }else {
                System.out.println("first character is special character");
            }
        }else{
            System.out.println("String empty");
        }

    }

}
