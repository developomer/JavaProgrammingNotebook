package day07_ifStatementsContinue;

public class Grade {

    public static void main(String[] args) {

        char grade = 'A';

        String result = "";

       /* if (grade == 'A') {
            result = "Excellent";
        }
        if (grade == 'B') {
            result = "Great job";
        }
        if (grade == 'C') {
            result = "Good";
        }
        if (grade == 'D') {
            result = "Passed";
        }
        if (grade == 'F') {
            result = "Failed";
        }

        System.out.println(result);*/

        if (grade == 'A'){
            result = "ex";
        } else if (grade == 'B') {
            result = "gre";
        } else if (grade == 'C') {
            result = "good";
        } else if (grade == 'D') {
            result = "pas";
        } else if (grade == 'F') {
            result = "fa";
        }else{
            result = "Nothing";
        }

        System.out.println(result);
    }

}
