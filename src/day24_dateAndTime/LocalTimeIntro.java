package day24_dateAndTime;

import java.time.LocalTime;

public class LocalTimeIntro {


    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        LocalTime staring_time = LocalTime.of(10, 30);

        System.out.println(staring_time);

        System.out.println(now);

        System.out.println("--------------------------------------------------");

        // LocalTime time = LocalTime.of(26,78); ERROR!!

        LocalTime max = LocalTime.MAX;
        System.out.println("MAX = " + max);

        LocalTime min = LocalTime.MIN;
        System.out.println("min = " + min);

        LocalTime noon = LocalTime.NOON;
        System.out.println("noon = " + noon);

        LocalTime midnight = LocalTime.MIDNIGHT;
        System.out.println("MIDNIGHT = " + midnight);

        System.out.println("---------------------------------------------------");

        LocalTime s = LocalTime.of(23,10,12);

        s = s.minusHours(1);
        System.out.println("s = " + s);

        s = s.plusMinutes(70);
        System.out.println("s = " + s);

        s = s.plusNanos(60);
        System.out.println("s = " + s);

        s = s.withMinute(0);
        System.out.println(s);

        s = s.withHour(0);
        System.out.println(s);





    }
}
