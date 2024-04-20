package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(1, numbers);

        System.out.println(list1);

        System.out.println("------------------------------------------------");

        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(75, 85, 95));

        System.out.println(scores);

        System.out.println("------------------------------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Gadir", "Hasan", "Abidullah", "Bilal"));

        System.out.println(students);
        students.addAll(2, Arrays.asList("Shukur", "Sumeye", "Tatiana"));

        System.out.println(students);

        System.out.println("------------------------------------------------");

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums));
        // overl
        //    l1.addAll(Arrays.asList(nums));

        System.out.println(l1);

        System.out.println("-------------------------------------------------");

        ArrayList<String> employeesList = new ArrayList<>(Arrays.asList("Ahmet", "Mahmut", "Hz.Hamza"));

        System.out.println(employeesList);

        boolean HzHamza = employeesList.contains("Hz.Hamza");

        boolean hasAhmetMahmut = employeesList.containsAll(Arrays.asList("Ahmet", "Mahmut"));

        boolean hasMahmutAliAhmet = employeesList.containsAll(Arrays.asList("Mahmut", "Ali", "Ahmet"));

        System.out.println("hzHamza = " + HzHamza);
        System.out.println("hasAhmetMahmut = " + hasAhmetMahmut);
        System.out.println("hasMahmutAliAhmet = " + hasMahmutAliAhmet);

        System.out.println("-------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 10, 10, 10, 10, 20, 20, 20, 20));

        System.out.println(list);

        list.removeAll(Arrays.asList(10, 20));

        System.out.println(list);

        System.out.println("-------------------------------------------------");

        ArrayList<String> developers = new ArrayList<>(Arrays.asList("Ahmet", "Mahmut", "Hz.Hamza"));
        developers.addAll(
                Arrays.asList("Alena", "Khashayar","Khashayar", "Madiyar", "Muhtar", "Muhtar", "Alena")
        );

        developers.retainAll(Arrays.asList("Alena", "Khashayar", "Muhtar"));

        System.out.println(developers);

        System.out.println("--------------------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.addAll(
        Arrays.asList("Eggs", "Potato", "Milk", "Tomato", "Rice", "ORANGE", "Strawberry", "Blueberry", "Paper towels")
        );

        groceriesList.retainAll(Arrays.asList("Eggs", "Potato", "Milk", "Tomato"));
// ==>  groceriesList.removeAll(Arrays.asList( "Rice", "ORANGE", "Strawberry", "Blueberry", "Paper towels"));

        System.out.println(groceriesList);





    }

}
