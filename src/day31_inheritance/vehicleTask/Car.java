package day31_inheritance.vehicleTask;

import java.time.LocalDate;

public class Car extends Vehicle{


    public Car(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
        drive();
    }

   public void drive(){
        System.out.println("Driving " + getBrand() +" "+getModel());
    }

}
