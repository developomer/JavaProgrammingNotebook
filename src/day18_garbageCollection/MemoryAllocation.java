package day18_garbageCollection;

import day17_customClass.Employee;

class Car{

    public String brand;
    public String model;
    public String color;
    public int year;  


}

public class MemoryAllocation {

    public static void main(String[] args) {

        int a = 100; // stack

    }

    public static void method1(){

        int b = 200; // stack

        Car car = new Car();
        //  stack   heap

        System.out.println("----------------------------------------");

        Employee employee1 = new Employee();
        Employee employee2 = employee1;

        employee1.setInfo("Twich", 30,  'M', "SDET", 100000, "AB2");

        System.out.println(employee1);
        System.out.println(employee2);

        System.out.println("-------------------------------------------");

        String batch1 = new String("Java");
        String batch2 = batch1;
        String batch3 = batch1;

    }

    public static void method2(){

        String c = "Hello ";
        //   stack    heap (String pool)
        String d = new String("Hello ");
        //   stack      heap
    }








}
