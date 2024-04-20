package day19_array;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        String[] myGroup= new String[4];

        myGroup[0] = "Ahmet";
        myGroup[myGroup.length-1] = "seel";

        System.out.println(Arrays.toString(myGroup));

        myGroup[3] = "sylas";
        System.out.println(Arrays.toString(myGroup));

        System.out.println("---------------------------");

        for (int i = myGroup.length-1; i >= 0 ; i--) { //  <==> myGroup.forr
            System.out.println(myGroup[i]);
        }

        System.out.println("-----------------------------");

        for (int i = myGroup.length - 1; i >= 0; i--) {

        }




    }

}
