package day30_inheritance.phoneTask;

public class Iphone extends Phone{

    public static boolean hasApplePay = true;

    public Iphone(String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
    }

    public void faceTime(long phoneNumber){
        System.out.println(getModel() + " is face timing with " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(getModel() + " is face timing with " + email);
    }

}
/*
2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)
 */