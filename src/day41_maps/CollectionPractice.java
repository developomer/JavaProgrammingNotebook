package day41_maps;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6));

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(7,8,9,10,11));

        List<List<Integer>> lists = new ArrayList<>();
        // lists.addAll(Arrays.asList(list, list1));
        lists.add(list);
        lists.add(list1);

        System.out.println(lists);

        //10
        System.out.println(lists.get(1).get(3));

        for (List<Integer> eachList : lists) {
            for (Integer eachElement : eachList) {
                System.out.println(eachElement);
            }
        }


        System.out.println("------------------------------------------------------------------");

        List<Set<Integer>> listOfSets = new ArrayList<>();
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());

        System.out.println(listOfSets);

        // {10, 5, 20}

        listOfSets.get(0).addAll(Arrays.asList(10, 5, 20, 10, 5, 20));
        listOfSets.get(1).addAll(Arrays.asList(10, 5, 20, 10, 5, 20));
        listOfSets.get(2).addAll(Arrays.asList(10, 5, 20, 10, 5, 20));
        listOfSets.get(3).addAll(Arrays.asList(10, 5, 20, 10, 5, 20));

        System.out.println(listOfSets);

    }

}
