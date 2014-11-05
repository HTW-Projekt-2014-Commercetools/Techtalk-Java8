package eu.janietz.java8.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DateOperations {

    public static void main(String[] args)
    {
	
		// Addition Operation auf Datum
        System.out.println("Es ist der: " + LocalDate.now()
                + " und morgen ist der " + LocalDate.now().plusDays(1));

		
        System.out.println("Die aktuelle Wochentag ist " + LocalDate.now().getDayOfWeek());

		// Abfrage über Zeitpunktsvergleich
        System.out.println(
                "Ist denn schon Freitag? " +
                        (LocalDate.now()
                                .isAfter(
                                (java.time.chrono.ChronoLocalDate)
                                TemporalAdjusters.next(DayOfWeek.FRIDAY)
                                    .adjustInto(LocalDate.now())) ? "Ja" : "Nein")
        );
    }

}
