package eu.janietz.java8.datetime;

import java.time.*;

public class CurrentTime {

    public static void main(String[] args)
    {
        // Zeit bestimmen
        System.out.println("Aktuelles Datum: " + LocalDate.now());
        System.out.println("Aktuelle Zeit: " + LocalTime.now());
        System.out.println("Aktuelle Zeit und Datum: " + LocalDateTime.now());
        System.out.println("Aktuelle Maschinenzeit (ohne Zeitzone): " + Instant.now());

        // Zeit erzeugen
        System.out.println("Datum des Java 8 Release: " + LocalDate.of(2014, Month.MARCH, 18));
        System.out.println("Uhrzeit für Arbeitsschluss: " + LocalTime.of(18, 0, 0));
        System.out.println("Neujahr: " + LocalDateTime.of(2014, 1, 1, 0, 0, 0));
    }

}
