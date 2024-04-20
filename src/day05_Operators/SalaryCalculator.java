package day05_Operators;

public class SalaryCalculator {

    public static void main(String[] args) {

        double hourlyRate = 55,
                weeklyHours = 45,
                stateTaxRate = 7.5,
                federalTaxRate = 24.5;
        //----------------------------------------

        double salaryBeforeTax = hourlyRate * weeklyHours * 52,
                stateTax = salaryBeforeTax * stateTaxRate / 100,
                federalTax = salaryBeforeTax * federalTaxRate / 100,
                totalTax = stateTax + federalTax,
                salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("Federal tax is: $" + federalTax);
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Total tax is: $" + totalTax);
        System.out.println("Net income is: $" + salaryAfterTax);

        System.out.println("------------------------------------");

        System.out.println("Gross pay is: $" + salaryBeforeTax +
                "\nFederal tax is: $" + federalTax  +
                "\nState tax is: $" + stateTax +
                "\nTotal tax is: $" + totalTax +
                "\nNet income is: $" + salaryAfterTax);

    }
}
