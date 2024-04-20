package day22_arrayList.PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReplaceAllTask {

    public static void main(String[] args) {

        ArrayList<Integer> arrayI = new ArrayList<>(Arrays.asList(10, 30, 20, 30, 40, 50));

        int oldValue = 30;
        int newValue = 300;

        System.out.println(arrayI);

        for (int i = 0; i < arrayI.size(); i++) {

            if (arrayI.get(i) == oldValue) {
                arrayI.set(i, newValue);
            }

        }

        System.out.println(arrayI);

        System.out.println("--------------------------------------------------------------");

        ArrayList<Double> arrayD = new ArrayList<>(Arrays.asList(10.3, 34.45, 34.32, 23.3, 10.3, 10.3));

        double oV = 10.3;
        double nV = 2.5;

        System.out.println(arrayD);

        for (int i = 0; i < arrayD.size(); i++) {

            if (arrayD.get(i) == oV){
                arrayD.set(i, nV);
            }

        }

        System.out.println(arrayD);

        System.out.println("--------------------------------------------------------------");

        ArrayList<Character> arrayC = new ArrayList<>(Arrays.asList('a', 'a', 'a', 'd', 'e'));

        char oV1 = 'a';
        char nV1 = 'x';

        System.out.println(arrayC);

        for (int i = 0; i < arrayC.size(); i++) {

            if (arrayC.get(i) == oV1){
                arrayC.set(i, nV1);
            }

        }

        System.out.println(arrayC);

        System.out.println("--------------------------------------------------------------");

        ArrayList<String> arrayS = new ArrayList<>(Arrays.asList("Niyet", "Hedef", "Hedef", "Hedef", "Gayret", "İnayet"));

        String oV2 = "Hedef";
        String nV2 = "Gayret";

        System.out.println(arrayS);

        for (int i = 0; i < arrayS.size(); i++) {

            if (arrayS.get(i) == oV2){
                arrayS.set(i, nV2);
            }

        }

        System.out.println(arrayS);


    }


}
