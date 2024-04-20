package day31_inheritance.vehicleTask;

import java.time.LocalDate;

public class Bike extends Vehicle{


    public Bike(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
        ride();
    }

    public void ride(){
        System.out.println("Riding "+getBrand()+" "+getModel());
    }

}
