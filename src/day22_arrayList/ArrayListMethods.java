package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30));

        list.add(10);
        list.add(20);
        list.add(30);
        list.addAll(list);

        // list.add(5.5);

        System.out.println(list);

        list.add(1, 15);

        System.out.println(list);

        list.add(2, 25);

        System.out.println(list);

        System.out.println("--------------------------------------------------------------");

        ArrayList<String> studentsList = new ArrayList<>();

        studentsList.add("HZ. Muhammed");
        studentsList.add("HZ. Musa");
        studentsList.add("HZ. Ebubekir");
        studentsList.add("HZ. Hasan");
        studentsList.add("HZ. Ömer");
        studentsList.add("HZ. Ali");

        System.out.println(studentsList.size());

        String firstStudent = studentsList.get(0);
        System.out.println(firstStudent);

        String lastStudent = studentsList.get(studentsList.size()-1);
        System.out.println(lastStudent);






    }

}
