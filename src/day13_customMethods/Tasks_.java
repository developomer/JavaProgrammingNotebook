package day13_customMethods;

public class Tasks_ {

    public static void main(String[] args) {
        System.out.println( combine("one","eight") );

    }

    public static String combine(String n1, String n2) {
        String result = n1 + n2;
        if (n1.charAt(n1.length() - 1) == n2.charAt(0)) {

            result = n1 + n2.substring(1);
        }
        return result;

        /*
        5.  Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
    Ex:
        combine("one", "eight")  ==> oneight

         */
    }



}
