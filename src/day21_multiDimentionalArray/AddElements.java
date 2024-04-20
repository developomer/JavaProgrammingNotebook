package day21_multiDimentionalArray;

import utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60, 70, 80};
        int element = 90;

        int[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;

        System.out.println(Arrays.toString(new_array));

        System.out.println("-----------------------------------------------");

        int[] numbers = {100, 90, 80, 70, 60};

        System.out.println(Arrays.toString(numbers));

        numbers = ArraysUtility.addElement(numbers, 50);

        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------------------------------------------");

        double[] nums = {1.5, 1.4, 34.45, 234.34};

        nums = ArraysUtility.addElement(nums, 5.5);

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println("---------------------------------------------------");

        String[] students = {"Yasin", "Şakir"};

        students = ArraysUtility.addElement(students, "Ermek");

        students = ArraysUtility.addElement(students, "Muhtar");

        System.out.println(Arrays.toString(students));



    }

}
