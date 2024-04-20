package day28_encapsulation.encapsulation;

public class Test {

    public static void main(String[] args) {

        Student student = new Student();
        student.setAge(0);

        System.out.println(student.getAge());


        // student.name = "Aaron";
        //  student.setName("Aaron");

        System.out.println(student.getName());

    }

}
