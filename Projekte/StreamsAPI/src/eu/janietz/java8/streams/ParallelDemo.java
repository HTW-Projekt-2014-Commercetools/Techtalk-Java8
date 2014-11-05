package eu.janietz.java8.streams;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.IntStream;

public class ParallelDemo {

    public static void main(String[] args)
    {
        // Nutzung mehrerer Threads (Anzahl nach CPU Anzahl bestimmt)
        Instant startedUnordered = Instant.now();
        IntStream.rangeClosed(1, 100).parallel()
                .forEach(
                    (i) -> {
                        System.out.println(String.format("Aufruf von Thread %s für Nummer %s",
                                Thread.currentThread().getName(), i));
                    }
                );
        System.out.println("Vergangene Zeit (ungeordnet):" + Duration.between(startedUnordered, Instant.now()));

        // Erwartung hier: Multithreading schneller, da geordnete Eingabe und geringe Menge Daten
        Instant startedOrdered = Instant.now();
        IntStream.rangeClosed(1, 100).parallel()
                .forEachOrdered(
                    (i) -> {
                        System.out.println(String.format("Geordneter Aufruf von Thread %s für Nummer %s", Thread.currentThread().getName(), i));
                    }
                );
        System.out.println("Vergangene Zeit (geordnet):" + Duration.between(startedOrdered, Instant.now()));
    }

}
