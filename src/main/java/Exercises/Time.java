package Exercises;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Time {

    public static void dateNow() {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Czas lokalny: " + ldt);

        Instant now = Instant.now();
        System.out.println("Instant: " + now);

    }

    public static void zoneTime() {

        Clock clock = Clock.system(ZoneId.of("Asia/Tokyo"));
        LocalDateTime ldt = LocalDateTime.now(clock);
        System.out.println("Czas lokalny w Tokio: " + ldt);

    }

    public static void dateFormat(){

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println("Date in format yyyy/MM/dd: " + formatter.format(ldt));

    }

    public static void main(String[] args) {

        dateNow();
        System.out.println();
        zoneTime();
        System.out.println();
        dateFormat();

    }

}
