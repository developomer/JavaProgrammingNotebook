package day40_collections;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(
                Arrays.asList("Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            String each = it.next();

            String reverse = "";

            for (int i = each.length()-1; i >= 0 ; i--) {
                reverse += each.charAt(i);
            }

            if (each.equalsIgnoreCase(reverse)){
                // names.remove(each);
                it.remove();
            }

        }

        System.out.println(names);

        System.out.println("----------------------------------------------");

        List<String> names1 = new ArrayList<>();
        names1.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        names1.removeIf( p -> StringUtility.reverse(p).equalsIgnoreCase(p));

        // names1.removeIf( p -> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p));

    }


}
