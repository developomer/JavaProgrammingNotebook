package day14_forLoop;

public class ForLoopPractice {

    public static void main(String[] args) {

        for (int i = 11  ; i >= 10; i--){
            System.out.println("HELLO");
        }

        System.out.println("------------------------------------------");


        // sum of all the numbers 1 ~ 100

        int sum = 0;

        for (int i = 1; i <= 100 ; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("------------------------------------------");

        // print all the alphabet letters A ~ Z

        for (char i = 'A'; i <= 'Z'; i++ ){
            System.out.print(i+ " ");
        }
        System.out.println("\n-------------------------------------------------------");

        // print all the alphabet letters in backwards Z ~ A

        for (char i = 'Z'; i >= 'A'; i--){
            System.out.print(i + " ");
        }


    }



}
