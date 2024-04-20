package day40_collections;

import java.util.*;

public class IterableExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 4, 1, 6, 9, 5, 1, 6, 2, 1, 2, 3, 6, 5));

      /*  for (Integer each : list) {
            if (each < 5){
                list.remove(each);
            }
        }

       */

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 5) {
                list.remove(i);
            }
        }

        System.out.println(list);

        System.out.println("---------------------------------------------------------");

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 4, 1, 6, 9, 5, 1, 6, 2, 1, 2, 3, 6, 5));

        Iterator<Integer> iterator = list1.iterator();

        while (iterator.hasNext()) {
            Integer each = iterator.next();
            if (each < 5) {
                iterator.remove();
            }
        }

        System.out.println(list1);

        System.out.println("---------------------------------------------------------");

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 4, 1, 6, 9, 5, 1, 6, 2, 1, 2, 3, 6, 5));

        for (Iterator<Integer> i = list2.iterator(); i.hasNext(); ) {

            Integer each = i.next();

            if (each < 5) {
                i.remove();
            }

        }

        System.out.println(list2);

        System.out.println("---------------------------------------------------------");

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,4,1,6,9,5,1,6,2,1,2,3,6,5));

        list3.removeIf(each -> each < 5);

        System.out.println(list3);

        System.out.println("---------------------------------------------------------");

        List<Integer> list4 = new LinkedList<>();
        list4.addAll(Arrays.asList(1,2,3,4,5,6,4,1,6,9,5,1,6,2,1,2,3,6,5));

        list4.removeIf(p -> p < 5);

        System.out.println(list4);



    }

}
