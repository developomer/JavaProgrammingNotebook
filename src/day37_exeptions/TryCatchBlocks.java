package day37_exeptions;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Program1 started");
        try {
            System.out.println(9 / 0); // Arithmetic Exception
            System.out.println("Try block");
        }catch (RuntimeException e){ // Throwable, Arithmetic

            System.out.println("Catch Block");

        }

        System.out.println("Program1 ended");

        System.out.println("----------------------------------");

        System.out.println("Program2 started");

        String str = null;

        try {
            System.out.println(str.toLowerCase()); // Arithmetic Exception
            System.out.println("Try block");
        }catch (RuntimeException e){ // Throwable , NullPointerException

            System.out.println("Catch Block");

        }

        System.out.println("Program2 ended");

        System.out.println("-------------------------------------------------------------------");

        System.out.println("Program3 started");

        try {

            Thread.sleep(5000);
            System.out.println("Try Block");

        }catch (InterruptedException e){ // Throwable

            System.out.println("Catch Block");

        }

        System.out.println("Program3 ended");
    }

}
