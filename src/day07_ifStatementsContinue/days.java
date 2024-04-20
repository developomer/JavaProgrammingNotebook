package day07_ifStatementsContinue;

public class days {

    public static void main(String[] args) {

        int day = 8;
        String result = "";
        if (day <= 7 && day >=1) {
            if (day == 1) result = "Monday";
            else if (day == 2) result = "Tuesday";
            else if (day == 3) result = "Wednesday";
            else if (day == 4) result = "Thursday";
            else if (day == 5) result = "Friday";
            else if (day == 6) result = "Saturday";
            else result = "Sunday";
        }else{
            result = "Invalid Day";
        }
        System.out.println(result);
    }
}
