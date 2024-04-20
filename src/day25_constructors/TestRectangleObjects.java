package day25_constructors;

public class TestRectangleObjects {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setInfo(5, 4);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setInfo(4, 5);

        Rectangle rectangle3 = new Rectangle();
        rectangle3.setInfo(6, 1);

        Rectangle rectangle4 = new Rectangle();
        rectangle4.setInfo(9, 8);

        Rectangle rectangle5 = new Rectangle();
        rectangle5.setInfo(11, 12);

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println(rectangle4);
        System.out.println(rectangle5);


    }

}
