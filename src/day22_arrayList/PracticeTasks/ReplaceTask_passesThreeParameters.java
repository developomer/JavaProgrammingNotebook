package day22_arrayList.PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReplaceTask_passesThreeParameters {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Scanner input = new Scanner(System.in);

        System.out.println("Enter replace index number: ");
        Integer index = input.nextInt();

        System.out.println("Enter replace new number: ");
        Integer newNumber = input.nextInt();

        arr.set(index, newNumber);

        System.out.println(arr);

        System.out.println("--------------------------------------------------------------------");

        ArrayList<Double> arr1 = new ArrayList<>(Arrays.asList(1.2, 2.1, 3.3, 4.2, 5.3));

        System.out.println("Enter replace index number: ");
        int index1 = input.nextInt();

        System.out.println("Enter replace new number: ");
        Double newNumber1 = input.nextDouble();


        arr1.set(index1, newNumber1);
        System.out.println(arr1);

        System.out.println("--------------------------------------------------------------------");

        ArrayList<Character> arr2 = new ArrayList<>(Arrays.asList('a', 'd', 'f'));

        System.out.println("Enter replace index character: ");
        int index2 = input.nextInt();

        System.out.println("Enter replace new character: ");
        char new_Ch = input.next().charAt(0);


        arr2.set(index2, new_Ch);
        System.out.println(arr2);

        System.out.println("---------------------------------------------------------------------");

        ArrayList<String> arr3 = new ArrayList<>(Arrays.asList("Öğrenme" , "Öğrenmek", "Muhakeme"));

        System.out.println("Enter replace index string: ");
        int index3 = input.nextInt();

        System.out.println("Enter replace new string");
        String new_Str = input.next();

        arr3.set(index3, new_Str);
        System.out.println(arr3);


    }

}
