package day22_arrayList.PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertTask {

    public static void main(String[] args) {

        ArrayList<Integer> arrayI = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        Integer index = 2;
        Integer element = 100;

        arrayI.add(index, element);

        System.out.println(arrayI);

        System.out.println("------------------------------------------------------");

        ArrayList<Double> arrayD = new ArrayList<>(Arrays.asList(1.5, 2.5, 3.5, 4.5, 6.5));

        arrayD.add(4, 5.5);

        System.out.println(arrayD);

        System.out.println("------------------------------------------------------");

        ArrayList<Character> arrayC = new ArrayList<>(Arrays.asList('a', 'c'));

        arrayC.add(1, 'b');

        System.out.println(arrayC);

        System.out.println("------------------------------------------------------");

        ArrayList<String> arrayS = new ArrayList<>(Arrays.asList("Uzun mu ", " kış ", " gecelerinde "));

        arrayS.add(1, " uzun ");

        System.out.println(arrayS);






















    }

}
