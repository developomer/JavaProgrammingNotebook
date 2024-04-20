package day31_inheritance.vehicleTask;

import java.time.LocalDate;

public class AirPlane extends Vehicle{


    public AirPlane(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
        fly();
    }

    public void fly(){
        System.out.println(getBrand() + " is flying");
    }

}
