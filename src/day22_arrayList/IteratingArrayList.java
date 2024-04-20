package day22_arrayList;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class IteratingArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(100, 200, 300, 400, 500));

        numbers.add(3, 255);

        System.out.println(numbers);

        System.out.println("---------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("----------------------------------------");

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }

        System.out.println("------------------------------------------");

        for (Integer number : numbers) {
            System.out.println(number);
        }

    }

}
