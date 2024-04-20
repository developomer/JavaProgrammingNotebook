package day10_String;


import java.util.Scanner;

public class StringIntro {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String str = "Java";

        System.out.println();

        input.close();


        System.out.println("------------------------------");


        String s1 = "Cat";
        String s2 = "Dog";
        String s3 = "Cat";
        String s4 = "Dog";

        System.out.println(s1 == s3);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);

        System.out.println("-----------------------------");

        String str2 = new String("Cat");
        String str3 = new String("Cat");

        System.out.println(str2 == str3);

    }
}
