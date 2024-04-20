package day08_Switch;

public class SwitchIntro {
    public static void main(String[] args) {

        /*
        A: Excellent
        B: Great Job
        C: Good
        D: Passed
        F: Failed
         */

        /*
        String result;

        if (grade == 'A'){
            result = "Excellent";
        }else if (grade == 'B'){
            result = "Great Job";
        }else if(grade == 'C'){
            result = "Good";
        }else if(grade == 'D'){
            result = "Passed";
        }else {
            result = "Failed";
        }

        System.out.println(result);

        System.out.println("----------------------------------");
*/

        char grade = 'L';

        String result;


        switch (grade) {

            case 'A':
                result = "Excellent";
                break;
            case 'B':
                result = "Great Job";
                break;
            case 'C':
                result = "Good";
                break;
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
            default:
                result = "UNEXPLAINED";
        }
        System.out.println(result);



    }
}
