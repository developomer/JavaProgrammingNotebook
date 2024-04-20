package day14_forLoop;

public class MethodOverLoadingPractice {

    public static void main(String[] args) {
        System.out.println(sum(234, 66754));
        System.out.println(sum(10, 23, 234));
        System.out.println(sum(10.4, 23.435));
        System.out.println(sum(123, 2344, 2345, 2345));
        System.out.println(sum(23423, 324.234234, 234234));
        System.out.println(sum(2345.2435,3245.235,2345.235,23545.35));
    }

    public static int sum(int num1, int num2) {

        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int sum(int num1, int num2, int num3, int num4) {
        // return sum(num1, num2) + num3 + num4;
        return sum(num1, num2, num3) + num4;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double sum(double num1, double num2, double num3) {
        return sum(num1, num2) + num3;
    }

    public static double sum(double num1, double num2, double num3, double num4) {
        return sum(num1, num2, num3) + num4;
    }
}
