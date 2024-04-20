package day11_StringContinue;

public class StringMethods1 {

    public static void main(String[] args) {

        String str = "CYDEO SCHOOL";

        str = str.toLowerCase(); //"cydeo school"

        System.out.println(str);

        //---------------------------------------------------


        String str1 = "java programming";

        String str2 = str1.toUpperCase();

        System.out.println(str1);
        System.out.println(str2);

        //---------------------------------------------------

        String word = "Wooden Spoon";

        word = word.toUpperCase(); // "WOODEN SPOON"
        word = word.toLowerCase(); // "wooden spoon"

        System.out.println(word);

        //---------------------------------------------------

        String str3 = "               Cydeo School";

        str3 = str3.trim(); // "Cydeo School"

        System.out.println(str3);

        System.out.println("-------------------------------------------");

        String sentence1 = "Today is Sunday, and we  have Java Class";

        int index1 = sentence1.indexOf('w');

        System.out.println(index1);

        String s1 = "I love Java Programming";

        int firstA = s1.indexOf('a');

        int secondA = s1.indexOf("a ");

        System.out.println(firstA);

        System.out.println(secondA);

        String s2 = "Java Python JavaScript Cydeo Python";

        int a1 = s2.indexOf('a');

        System.out.println(a1);

        int a2 = s2.indexOf("a ");

        System.out.println(a2);

        int a3 = s2.indexOf(" Ja");

        System.out.println(a3);

        int a4 = s2.indexOf("aS");

        System.out.println(a4);

        //------------------------------------------------------

        String w = "Java";

        System.out.println(w.indexOf('a'));

        System.out.println(w.lastIndexOf('a'));

        String w1 = "Java Python JavaScript Cydeo Python";

        System.out.println(w1.lastIndexOf('a'));

        System.out.println(w1.lastIndexOf('P'));


    }
}
