package day17_customClass;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee me = new Employee();
        me.setInfo("Ömer", 20, 'M', "Java Developer", 100000, "A203");

        me.name = "Amr";

        System.out.println(me);

        me.work();



    }



}
