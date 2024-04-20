package day12_CustomMethodsIntro;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Split or No split ( Yes or No)?");
        String yesOrNo = scr.nextLine().toLowerCase();

        System.out.println("Enter the number of people:");
        int nop = scr.nextInt();

        System.out.println("Enter the check amount:");
        double checkAmount = scr.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String quality = scr.next().toLowerCase();

        double qualityPercent = (quality.equals("excellent"))? 0.25 :
                (quality.equals("great"))? 0.2 :
                (quality.equals("good"))? 0.15 :
                (quality.equals("fair"))? 0.1 : 0.05;

        double totalTip = checkAmount * qualityPercent;



        System.out.println("Number of people entered: " + nop +
                "\nTotal to pay: " + checkAmount +
                "\nTotal tip: " + totalTip);

        if (yesOrNo.equals("yes")){
            System.out.println("Total per person: "+ (checkAmount / nop));
            System.out.println("Tip per person: "+ (totalTip / nop));
        }
scr.close();




    }
}
