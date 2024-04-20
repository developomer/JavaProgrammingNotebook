package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Vasyl", "Vasyl", "Sumeye", "Sumeye", "Ali" , "Sumeye"));
        names.add("Shukir");
        names.add("Marika");
        names.add("Marika");

        for (String each : names) {
            if (names.indexOf(each) == names.lastIndexOf(each)){
                System.out.println(each);
                // break;
            }
        }










    }

}
