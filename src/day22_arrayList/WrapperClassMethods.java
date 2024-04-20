package day22_arrayList;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "20";

        System.out.println(str + 1);

        // Integer num1 = Integer.parseInt(str); // Unboxing

        int num = Integer.parseInt(str);

        System.out.println(num + 1);

        Integer num2 = Integer.valueOf(str);

        System.out.println(num2 + 1);

        System.out.println("-----------------------------------------------");

        String s = "20.5";
                                               // Bu kullanım da string değerini primitive karşılığı olarak dönüştürür.
        double num3 = Double.parseDouble(s);  // double num3 =  Double.valueOf(s);
                        // Bu kullanım da string i direkt nesne olarak atarız

        Double num4 =Double.valueOf(s); // Double.parseDouble(s) Bu şekilde de yazılabilir.

        System.out.println(num3);
        System.out.println(num4);

        System.out.println("-------------------------------------------------");

        String x = "false";

        boolean r1 = Boolean.parseBoolean(x);

        Boolean r2 = Boolean.valueOf(x);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("-------------------------------------------------");

        char ch = '$';

        boolean isDigit = Character.isDigit(ch);
        // isDigit = true because the variable ch is a number, but when ch is not a number, isDigit = false
       // isDigit = true çünkü ch değişkeni bir sayıdır, ancak ch bir sayı olmadığında, isDigit = false

        boolean isLetter = Character.isLetter(ch);
        // isLetter = true   >>>  variable ch is not a number.

        boolean isLowerCaseLetter = Character.isLowerCase(ch);
        //true when ch is lowercase. //ch küçük harfli olduğunda true olur.

        boolean isUpperCaseLetter = Character.isUpperCase(ch);
        //!!!!!(true when ch is lowercase. //ch küçük harfli olduğunda true olur.)

        boolean isSpecialChar = !Character.isLetterOrDigit(ch); // special character

        /*int a = Character.charCount(ch);

        System.out.println(a);

         */

        System.out.println("isDigit = " + isDigit);

        System.out.println("isLetter = " + isLetter);

        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter);

        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);

        System.out.println("isSpecialChar = " + isSpecialChar);

        System.out.println("------------------------------------------*****************************");

        String string = "a1b2c3d4e5";

        int sum = 0;

        for (char each : string.toCharArray()) {

            if (Character.isDigit(each)){
                sum += Integer.parseInt(""+each);
            }

        }
        System.out.println("sum = " + sum);




    }

}
