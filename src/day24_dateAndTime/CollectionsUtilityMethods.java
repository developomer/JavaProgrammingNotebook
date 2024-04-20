package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(
                Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        System.out.println(names);

        System.out.println();
        System.out.println("------------------------replaceAll Method------------------------");
        /*pfor (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals("Java")){
                names.set(i, null);
            }
        }
        System.out.println(names);

         */ // BAZI DURUMLARDA DAHA MANTIKLI

        Collections.replaceAll(names, "Java", "Python");

        System.out.println(names);
        System.out.println();
        System.out.println("-----------------------frequency Method-(Integer)-------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30, 40, 40, 50, 50, 50, 60, 60, 50, 50, 50));

        int count = Collections.frequency(list, 50);

        System.out.println(count);

        System.out.println();
        System.out.println("-----------------------frequency Method-(String)------------------");

        ArrayList<String> words = new ArrayList<>(
        Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        int countJava = Collections.frequency(words, "Java");

        System.out.println(countJava);

        System.out.println();
        System.out.println("-----------------------frequency Method-(Unique)------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 20, 30, 40, 40, 50, 50, 50, 60, 60, 50, 50, 50));

        for (Integer each : numbers) {
            if (Collections.frequency(numbers, each) == 1){
                System.out.println(each);
            }
        }







    }

}
