package day24_dateAndTime;

import javax.security.auth.callback.LanguageCallback;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateIntro {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today);

        /*LocalDateTime todayClock = LocalDateTime.now();

        System.out.println(todayClock);

         */

        LocalDate birthDay = LocalDate.of(2003, 8, 7);

        System.out.println(birthDay);

        System.out.println("------------------------------------------------------");

        System.out.println( today.getYear() );
        System.out.println( today.getMonth() );
        System.out.println( today.getMonthValue() );
        System.out.println( today.getDayOfYear() );
        System.out.println( today.getDayOfMonth() );
        System.out.println( today.getDayOfWeek() );

        System.out.println( birthDay.getDayOfWeek() );

        System.out.println("-------------------------------------------------------");

        today = today.plusYears(1);

        System.out.println( today.plusYears(1) );

        System.out.println( today.minusYears(1) );

        System.out.println( birthDay.plusDays(1));

        System.out.println("-------------------------------------------------------");

        LocalDate graduationDate = LocalDate.of(2025, 6, 4);
        System.out.println(graduationDate);

        graduationDate = graduationDate.plusYears(2);
        System.out.println(graduationDate);

        graduationDate = graduationDate.plusMonths(7);
        System.out.println(graduationDate);

        graduationDate = graduationDate.plusWeeks(7);
        System.out.println(graduationDate);

        graduationDate = graduationDate.plusDays(100);
        System.out.println(graduationDate);

        System.out.println("-------------------------------------------------------");

        LocalDate yourBirthDay = LocalDate.of(2005, 4, 1);
        LocalDate yourBrotherBirthDay = yourBirthDay.minusYears(2).minusMonths(3);

        System.out.println("yourBirthDay = " + yourBirthDay);
        System.out.println("yourBrotherBirthDay = " + yourBrotherBirthDay);

        System.out.println("-------------------------------------------------------");

        LocalDate birthday1 = LocalDate.of(1994, 7,7);
        LocalDate birthday2 = LocalDate.of(1994, 7, 7);

        boolean r1 = birthday2.equals(birthday1);

        System.out.println(r1);

        System.out.println("--------------------------------------------------------");

        LocalDate grad_date = LocalDate.of(2023, 1, 1);

        System.out.println(grad_date.isBefore( LocalDate.of(2022, 12, 31)));
        System.out.println(grad_date.isAfter( LocalDate.of(2022, 12, 31)));

        System.out.println( LocalDate.of(2022, 6, 16) .isLeapYear());


    }

}
