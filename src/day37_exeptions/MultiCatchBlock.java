package day37_exeptions;

import day35_polymorphism.transpotationTask.Car;

public class MultiCatchBlock {

    public static void main(String[] args) {

        System.out.println("Program1 started");

        Car car = null;

        try {
            car.drive(); // NullPointerException
            int a = 3 / 0;
        }catch (ArithmeticException e){
            System.out.println("First Catch Block");
            e.printStackTrace();
        }catch(ClassCastException e){
            System.out.println("Second Catch Block");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("Third Catch Block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Fourth Catch Block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fifth Catch Block");
            e.printStackTrace();
        }


        System.out.println("Program1 ended");


  /*
        try{

        }catch (RuntimeException e){

        }try{

        }try{

        }try{

        }

   */

    }

}