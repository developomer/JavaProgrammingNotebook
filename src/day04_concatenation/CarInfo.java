package day04_concatenation;

public class CarInfo {

    public static void main(String[] args) {

        int year = 2003,
            mil = 5000,
                price = 190000;

        String make = "Mercedes",
                model = "A4",
                color = "White",
                Price = "$" + price;

        System.out.println("Car information is : \n\t" +
                year + " " + make + " " + model +
                ", " + mil + " miles, " + color + ", " + Price);



    }
}
