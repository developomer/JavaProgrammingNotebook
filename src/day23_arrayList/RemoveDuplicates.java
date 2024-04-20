package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Vasyl", "Vasyl", "Sumeye", "Sumeye", "Ali" , "Sumeye"));

        ArrayList<String> nonDup = new ArrayList<>();

        for (String each : names) {

            if (nonDup.contains(each)){
                continue;
            }
            nonDup.add(each);

        }

        System.out.println(names);
        names = nonDup;
        System.out.println(names);
        System.out.println(nonDup);




    }


}
