package day19_array;

import java.text.DecimalFormat;

public class DecimalFormatPractice {

    public static void main(String[] args) {

    DecimalFormat df = new DecimalFormat("0.000");

    double n1 = 10.99999999999999999999999;

        System.out.println("n1 = " + df.format(n1));







    }


}
