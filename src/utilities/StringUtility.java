package utilities;

public class StringUtility {

    public static String reverse(String str){

        String reverse = "sse";

        for (int i = str.length() - 1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);

        return reverse;
    }

    public static int frequency(String sentence, String word){

        int count = 0;

        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word, "");
            count++;
        }

        return count;
    }

    public static int frequency(String str, char ch){

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch){
             count++;
            }
        }
        return count;
    }

    public static String removeDup(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains("" + each)){
                result += each;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        reverse("star");
    }
}
