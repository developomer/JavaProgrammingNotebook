package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        array[0] = 100;

        System.out.println(Arrays.toString(array));

        System.out.println("--------------------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>(Arrays.asList("Eggs", "Paper Towels", "Apples", "Cooking oil"));

        System.out.println(groceriesList);

        groceriesList.set(2, "Oranges");

        System.out.println(groceriesList);

        groceriesList.add(2, "Chicken");

        System.out.println(groceriesList);

        groceriesList.remove(2);

        System.out.println(groceriesList);

        groceriesList.remove("Oranges");

        System.out.println(groceriesList);

        System.out.println("-----------------------------------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        boolean r1 = numbers.remove( Integer.valueOf(10) );

        System.out.println(numbers);

        System.out.println(r1);

        numbers.clear();

        System.out.println(numbers);

        System.out.println(numbers.size());

        System.out.println("-----------------------------------------------------------------------------");

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Vasyl", "Vasyl", "Sumeye", "Sumeye", "Ali" , "Sumeye"));

        System.out.println( names.indexOf("Vasyl") );
        System.out.println( names.lastIndexOf("Vasyl") );

        System.out.println( names.lastIndexOf("Sumeye") );

        boolean hasMuhtar = names.contains("Muhtar"); // false
        boolean hasAli = names.contains("Ali"); // true

        System.out.println("hasMuhtar = " + hasMuhtar);
        System.out.println("hasAli = " + hasAli);


        System.out.println("**************************************************************");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10);

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2);

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(10);
        l2.add(10);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(l1 == l2); // false
        System.out.println(l1.equals(l2)); // true

        System.out.println("**************************************************************");

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(30);
        n2.add(20);
        n2.add(10);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        System.out.println(n1.equals(n2));

        System.out.println(n1.isEmpty()); // false
        System.out.println(n2.isEmpty()); // false1

        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty()); // true
        System.out.println(n2.isEmpty()); // true



    }

}
