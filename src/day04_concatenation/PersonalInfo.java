package day04_concatenation;

import java.util.function.BinaryOperator;

public class PersonalInfo {
    public static void main(String[] args) {

        String firstName = "Ömer",
                lastName = "Tokay";
        char gender = 'M';
        int age = 20;

        String from = "Türkiye",
                favoriteMusic = "focus Music",
                favoriteBook = "Science",
                favoriteShow = "...",
                favoriteColor = "Black and White",
                marriedStatus = "Freedom",
                employeeStatus = "Student";

        System.out.println("firstName: " + firstName);
        System.out.println(" lastName: " + lastName);
        System.out.println("  gender: " + gender);
        System.out.println("   age: " + age);
        System.out.println("    from: " + from +
                "\n favoriteMusic: " + favoriteMusic +
                "\n  favoriteBook: " + favoriteBook +
                "\n   favoriteShow: " + favoriteShow +
                "\n    favoriteColor: " + favoriteColor +
                "\n     marriedStatus: " + marriedStatus +
                "\n      employeeStatus: " + employeeStatus);


    }
}
