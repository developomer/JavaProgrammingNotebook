package day07_ifStatementsContinue;

public class LoanApplication {
    public static void main(String[] args) {

        int salary = 200000,
                creditScore = 100;
        String result;

        if (salary >= 45000 && creditScore >= 700){
            result = "You are eligible for a loan.";
        }else{
            result = "You are not eligible for loan.";
        }

        System.out.println(result);
    }
}
