package day07_ifStatementsContinue;

public class GradeLevel {

    public static void main(String[] args) {

        int gradeLevel = 16;

       String result = "";
        if (gradeLevel <= 18 && gradeLevel >=1) {
            if (gradeLevel <= 5) {
                result = "Elementary school";
            } else if (gradeLevel <= 8) {
                result = "Middle school";
            } else if (gradeLevel <= 12) {
                result = "High school";
            } else if (gradeLevel <= 16) {
                result = "College";
            } else {
                result = "Grad school";
            }
    }
        System.out.println(result);


    }
}
