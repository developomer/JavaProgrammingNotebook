package day18_garbageCollection;

import java.util.Scanner;

public class TestBankAccountObjects {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        BankAccount obj1 = new BankAccount();
        obj1.setInfo("Omer Tokay", 538087);
        System.out.println(obj1);

        obj1.deposit(1000);

        obj1.checkBalance();

        obj1.withdraw(700);

        obj1.checkBalance();

        obj1.deposit(-2424);

        obj1.checkBalance();

        obj1.withdraw(43522);

        obj1.checkBalance();

        System.out.println("---------------------------------");













    }



}
