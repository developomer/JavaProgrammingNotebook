package day11_StringContinue;

public class StringMethods2 {

    public static void main(String[] args) {

        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

        sentence = sentence.replace("Python" , "Java");

        sentence = sentence.replace('a' , 'e');

        System.out.println(sentence);

        //---------------------------------------------------------


        String word = "java";

        word = word.replace('a','e');

        System.out.println(word);

        //--------------------------------------------------------

        String sentence2 = "I love Java, Java is cool";

       // sentence2 = sentence2.replace("Java", "Python");

        sentence2 = sentence2.replaceFirst("Java", "Python");

        System.out.println(sentence2);

        //--------------------------------------------------------

        String sentence4 = "I love Java Programming";

        String languageName = sentence4.substring(7, 10+1);

        System.out.println(languageName);

        //--------------------------------------------------------

        String sentence5 = "Today is Sunday, Tomorrow is Monday";

        String today = sentence5.substring(9, 14+1);

        System.out.println(today);

        //-------------------------------------------------------

        String email = "CydeoSchoolJavaProgramming@gmail.com";

        int beginning = email.indexOf("@") + 1;
        int ending = email.lastIndexOf('.');

        String domain = email.substring(beginning, ending);
        System.out.println(domain);

        //-------------------------------------------------------

        String sentence6 = "I love Java programming";

        //   String r1 = sentence6.substring(7, sentence6.length());

        String r1 = sentence6.substring(7);

        System.out.println(r1);

        //--------------------------------------------------------

        String sentence7 = "Today is Sunday, Tomorrow is Monday";

        String tomorrow = sentence7.substring( sentence7.lastIndexOf(" ") + 1);

        System.out.println(tomorrow);

        //--------------------------------------------------------

        String str = "Phyton";

        String result = (str +"\n").repeat(10);

        System.out.println(result);


    }
}
