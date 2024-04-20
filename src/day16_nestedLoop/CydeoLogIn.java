package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = input.next();

        System.out.println("Enter your password:");
        String p = input.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
            System.out.println("Logged in");
        } else {

            for (int i = 0; i < 3; i++) {

               /* if (i != 2) {
                    System.err.println("Incorrect username or password, please re-enter");
                } else {
                    System.err.println("This is your last chance, Please re-enter your username ans password");
                }

                */

                System.out.println("Enter your username:");
                u = input.next();
                System.out.println("Enter your password");
                p = input.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
                    System.out.println("You are now logged in");
                    break;
                }

            }

            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) {
                System.err.println("Your account now is locked, please contact with the support team");
            }

        }
            input.close();

    }

    public static void cydeoLogIn(String username, String password){
        if (username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.err.println("Logged in");
        }else {
            System.err.println("Invalid credentials");
        }
    }













}
