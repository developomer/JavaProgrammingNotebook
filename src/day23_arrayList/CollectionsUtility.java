package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {
        System.out.println("-----------------------------MAX & MİN METHOD-------------------------");

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7, 1, 2, 3, 4, 5, 6, 7, 8));
        System.out.println(list);
        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("max = " + max);

        System.out.println("min = " + min);

        System.out.println();
        System.out.println("------------------------------SORT METHOD----------------------------");

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Eggs", "Potato", "Milk", "Tomato", "Rice", "ORANGE", "Strawberry", "Blueberry", "Paper towels"));
        System.out.println(items);
        Collections.sort(items);

        System.out.println(items);

        System.out.println();
        System.out.println("----------------------------REVERSE METHOD---------------------------");
        System.out.println(items);
        Collections.reverse(items);

        System.out.println(items);

        System.out.println();
        System.out.println("------------------------------SWAP METHOD----------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Gadir", "Hasan", "Abidullah", "Bilal"));

        System.out.println(students);

        Collections.swap(students, 0, 1);

        System.out.println(students);

        Collections.swap(students, 0, students.size()-1);

        System.out.println(students);

        System.out.println();
        System.out.println("------------------------------SWAP METHOD----------------------------");





    }

}
