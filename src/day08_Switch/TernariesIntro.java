package day08_Switch;

public class TernariesIntro {

    public static void main(String[] args) {

        int score = 5;

        String result = (score >= 60) ? "Passed" :(score == 0)? "Failed" : "Maybe";

        System.out.println(result);

        int n = 1;

        String day = (n == 1)?"Monday": (n ==2)?"Tuesday": (n ==3)?"Wednesday": (n ==4)?"Thursday": (n ==5)?"Friday": (n ==6)?"Saturday": "Sunday";

        System.out.println(day);

        System.out.println("----------------------------------------------");

        int num = 10;

        String month = (n ==1)?"JAN": (n ==2)?"FEB": (n ==3)?"MAB": (n ==4)?"APR": (n ==5)?"MAY": (n ==6)?"JUN": (n ==7)?"JUL":(n ==8)?"AUG":(n ==9) ?"SEP/SEPT":(n ==10) ?"OCT":(n ==11) ?"NOV":"DEC";
        System.out.println("Month: " + month);

        System.out.println("----------------------------------------------");

        int score1 = 30;

        // if - if - else - else Important
        String result2 = (score1 >= 0 && score1 <= 100)?
                (score1 >= 60)?"Passed" : "Failed"
                :"Invalid";
        System.out.println(result2);


    }
}
