package day19_array;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        int score1 = 85;
        int score2 = 75;
        int score3 = 76;
        int score4 = 78;
        int score5 = 88;
        int score6 = 95;

        System.out.println("-----------------------------");

        int[] scores = new int[6]; // index: 0~5

        scores[0] = 95;
        scores[1] = 85;
        scores[2] = 75;
        scores[3] = 76;
        scores[4] = 78;
        scores[5] = 88;

        // scores[6] = 56;
       // scores[-1] = 100;
      // scores = new int[10]; --> index: 0~9

        System.out.println( Arrays.toString(scores));

        System.out.println( scores[3] );
        System.out.println( scores[5] );

        System.out.println("-------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println( ( i + 1 ) + ". Student = " + scores[i]);
        }
        System.out.println("--------------------------------");

        System.out.println(scores[scores.length-1]);

    }


}
