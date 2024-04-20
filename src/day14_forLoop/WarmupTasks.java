package day14_forLoop;

public class WarmupTasks {

    public static void main(String[] args) {

        String str3 = combine("java", "apple");

        System.out.println(str3);


        String s1 = "" + true;
        String s2 = ""+'e';

        System.out.println("-------------------------------");

        System.out.println( sumOf2Numbers(10, 20) );
        System.out.println( sumOf3Numbers(10, 20, 30) );
        System.out.println( sumOf4Number(10, 20, 30, 40) );

    }

    public static String combine(String str1, String str2){

        String result = "";

       /* if (str1.endsWith( ""+str2.charAt(0) ) ){
            result = str1 + str2.substring(1);
        }else {
            result = str1 + str2;
        }

        */

        result = (str1.charAt(str1.length() - 1) == str2.charAt(0))?
                 str1 + str2.substring(1) : str1 +str2;

        return result;
    }

    public static int sumOf2Numbers(int n1, int n2){
        return n1+n2;
    }

    public static int sumOf3Numbers(int num1, int num2, int num3){
       // return num1 + num2 + num3;
        return sumOf2Numbers(num1, num2) + num3;
    }

    public static int sumOf4Number(int num1, int num2, int num3, int num4){
        // return num1+num2+num3+num4;
        // return sumOf3Numbers(num1, num2, num3) + num4 ;
        // return sumOf2Numbers(num1, num2) + sumOf2Numbers(num3, num4);
        // return sumOf2Numbers( sumOf3Numbers(num1, num2, num3) , num4);
        return sumOf3Numbers( sumOf2Numbers(num1, num2) , num3, num4 );
    }


}
/*Task1:
        Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.

        combine("one", "eight")  ==> oneight

        Task 2:
        1. create a method that can find the sum of two integer numbers
        method name: sumOf2Numbers

        2. create a method that can find the sum of three integer numbers
        method name: sumOf3Numbers

        3. create a method that can find the sum of four integer numbers
        method name: sumOf4Numbers
 */