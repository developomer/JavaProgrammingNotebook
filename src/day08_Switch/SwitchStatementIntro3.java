package day08_Switch;

public class SwitchStatementIntro3 {

    public static void main(String[] args) {

        int score = 40;

        String result = "";
        
        if (score >= 90){
            result = "A";
        } else if (score >= 80 && score < 90) {
            result = "B";
        } else if (score >= 70) {
            result = "C";
        } else if (score >= 60) {
            result = "D";
        } else {
            result = "F";
        }

        System.out.println(result);

    }
}
