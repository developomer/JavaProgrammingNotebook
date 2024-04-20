package day37_exeptions;

import day36_polymorphism.Circle;

public class TestPizzaObject {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('L', 3, 3);

        Pizza pizza2 = new Pizza('L', 2,3);

        Pizza pizza3 = new Pizza('S', 2,3);

        System.out.println(pizza1 == pizza2);

        System.out.println(pizza1.equals(pizza2));

        Object object = new Pizza('L', 2,3); // upcasting

        boolean r = object.equals(pizza2);

        System.out.println(r);

        double total = ((Pizza)object).calCost();

        System.out.println(total);

        //  double area = ( (Circle) object).area();
       // System.out.println(area);

    }

}
