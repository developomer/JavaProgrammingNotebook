package day19_array;

import java.util.Arrays;

public class ArrayLiterals {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        int[] nums = {1, 2, 3, 4, 5};

        System.out.println("nums.length = " + nums.length);
        System.out.println("numbers.length = " + numbers.length);

        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("numbers = " + Arrays.toString(numbers));

        System.out.println("-------------------------------------------------");

        String[] days = {"Monday", "Sunday" };
        int n = 0;

        System.out.println("Day = " + days[n] );

        System.out.println("----------------------------------------------------------");

        String[] months = {"jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        /*
        month = new String[12];
        month[0] = "Jan"
        ...
         */



        System.out.println("month = " + Arrays.toString(months));

        System.out.println("-----------------------------------------------------------------------------");

        // int[] number2 = new int[100];

        for (int i = months.length - 1; i >= 0; i--) {
            System.out.println(months[i]);
        }






    }



}
