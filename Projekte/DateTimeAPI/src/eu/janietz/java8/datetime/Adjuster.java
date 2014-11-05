package eu.janietz.java8.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Adjuster {

    public static void main(String[] args)
    {
        // Datum des nächsten Montag besimmen
        LocalDate dateOfNextMonday = LocalDate.from(TemporalAdjusters.next(DayOfWeek.MONDAY).adjustInto(LocalDate.now()) );

        // Einen eigenen Zeitmodifizierer erzeugen
        TemporalAdjuster nextDayAdjuster = dt -> {
            LocalDate input =  (LocalDate) dt;
            LocalDate result = input.plusDays(1);
            return result;
        };
		
		// Nutzung eines eigenen Zeitmodifizierers
        LocalDate oneDayLater = LocalDate.from(nextDayAdjuster.adjustInto(LocalDate.now()));

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        System.out.println(String.format("Der nächste Montag ist am: %s", formatter.format(dateOfNextMonday)));
        System.out.println(String.format("Der nächste Tag ist: %s", formatter.format(oneDayLater)));
    }

}
