package day07_ifStatementsContinue;

public class NetIncomeCalc {

    public static void main(String[] args) {

       int salary = 200000;
       boolean isMarried = false;

       double taxRate = 0;

        if (130000 <= salary){
            taxRate = 0.35;
        }
        if (100000 <= salary && salary <= 129000){
            taxRate = 0.3;
        }
        if (80000 <= salary && salary <= 99000){
            taxRate = 0.25;
        }
        if (79000 >= salary){
            taxRate = 0.2;
        }
        if (isMarried){
            taxRate -= 0.05;
        }

        double netIncome = salary * (1 - taxRate),
                totalTax = salary * taxRate;

        System.out.println("salary = " + salary);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);

    }
}
