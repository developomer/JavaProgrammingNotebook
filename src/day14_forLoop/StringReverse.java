package day14_forLoop;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        String reverse = "";


     /*   for (int i = 3; i >= 0; i-- ){
            System.out.print(str.charAt(i));

        }

      */

        for (int i = str.length() - 1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);

        System.out.println("--------------------------------");

        String name = "Ahmet Emin Neslihan Hatice Buse Tokay";

        String result = reverse(name);

        System.out.println(result);

    }

    public static String reverse(String str){

        String reverse = "";

        for (int i = str.length() - 1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);




        return reverse;
    }


}
