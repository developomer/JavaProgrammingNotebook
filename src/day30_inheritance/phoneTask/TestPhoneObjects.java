package day30_inheritance.phoneTask;

public class TestPhoneObjects {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "Large","Black", 1200.5);

        Samsung samsung = new Samsung("Galaxy S22", "M", "White", 1200.4);

        Nokia nokia = new Nokia("Brick", "S", "Pink", 50);

        iphone.call(911);
        samsung.call(911);
        nokia.call(911);


        iphone.text(123456789);
        samsung.text(123456789);
        nokia.text(123456789);

        System.out.println("-------------------------------");

        iphone.faceTime(123456789);
        // samsung.faceTime(123456789);
        // nokia.faceTime(123456789);

        samsung.freeze();
        // iphone.freeze();
        //  nokia.freeze();

        nokia.selfDefense();
        //   iphone.selfDefense();
        //   samsung.selfDefense();

        System.out.println("-------------------------------");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

    }


}
