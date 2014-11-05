package eu.janietz.java8.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimezoneDemo {

    public static void main(String[] args)
    {
        // Aktuelle Zeit in New York
        ZonedDateTime newYorkTime = ZonedDateTime.of(
                LocalDate.now(),
                LocalTime.now(),
                ZoneId.of("America/New_York")
        );
        System.out.println(String.format("In New York ist es gerade: %s", newYorkTime.toString()));
    }

}
