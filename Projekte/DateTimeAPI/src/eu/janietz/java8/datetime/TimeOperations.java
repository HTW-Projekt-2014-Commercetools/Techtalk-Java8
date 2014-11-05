package eu.janietz.java8.datetime;

import java.time.LocalTime;

public class TimeOperations {

    public static void main(String[] args)
    {
		// Aktuelle Zeit bestimmen und Addition durchführen
        System.out.println("Es ist: " + LocalTime.now()
                + " und in einer Stunde ist es " + LocalTime.now().plusHours(1));

		// Stundenzahl aus Zeitpunkt extrahieren
        System.out.println("Die aktuelle Stunde ist " + LocalTime.now().getHour());

		// Zeitvergleich mit anderem Zeitpunkt
        System.out.println(
                "Ist 23:59 vor 0:00? " +
                        (LocalTime.of(23,59).isBefore(LocalTime.of(0,0)) ? "Ja" : "Nein")
        );
    }

}
