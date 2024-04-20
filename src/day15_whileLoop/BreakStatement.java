package day15_whileLoop;

public class BreakStatement {

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {

            if (i == 6){ // if i's value reaches 6
                break; // exits loop
            }
            System.out.println(i);
        }


        System.out.println("---------------------------");

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i);
        }

        for (char i = 'A'; i <= 'Z'; i++) {

            if ( i == 'J'){
                System.out.println("Loops is terminated");
                break;       // print eğer ki if den önce olursa if de mesela J ise J yi de dahil eder ondan sonra durur.
            }
            System.out.println(i);
        }

        System.out.println("--------------------------------");

        for (;;){
            System.out.println("Hello My Planet");
            break;
        }



    }
}
