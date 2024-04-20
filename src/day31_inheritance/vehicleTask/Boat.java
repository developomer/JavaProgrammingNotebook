package day31_inheritance.vehicleTask;

import java.time.LocalDate;

public class Boat extends Vehicle{


    public Boat(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
        sail();
    }

    public void sail(){
        System.out.println(getBrand()+" "+getModel()+" is sailing");
    }


}
