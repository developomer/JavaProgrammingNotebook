package day05_Operators;

public class LogicalOperators {

    public static void main(String[] args) {

        double salary = 25000;
        int creditScore = 700;


        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650;
        //                             false                 true

        System.out.println(eligibleForLoan);

        System.out.println("-----------------------------------------------");

        int age = 18;
        String country = "USA";

        boolean eligibleToVote = age >= 18 && country == "USA";

        System.out.println(eligibleToVote);

        System.out.println("-----------------------------------------------");

        String answer = "maybe";

        boolean validAnswer = answer != "yes" && answer != "no";

        System.out.println(validAnswer);

        System.out.println("-------------------------------------------------");

        char grade = 'B';

        boolean passedTheExam = grade == 'A' || grade == 'B' || grade  == 'C'||grade == 'D';

        System.out.println(passedTheExam);

        System.out.println("--------------------------------------------------");

        System.out.println( !true );

        String a = "yes";

        boolean yes = a == "yes",
                no = !yes;

        System.out.println("yes = " + yes);
        System.out.println("no = " + no);

        System.out.println("---------------------------------------------------");
        
        int score = 65;
        
        boolean passed = score >= 60,
                failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

        System.out.println("----------------------------------------------------");

        System.out.println( true == !false && false == !true && true != !true);




    }
}
