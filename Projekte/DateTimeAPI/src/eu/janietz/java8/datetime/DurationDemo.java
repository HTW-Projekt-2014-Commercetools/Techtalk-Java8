package eu.janietz.java8.datetime;

import java.time.Duration;
import java.time.Instant;

public class DurationDemo {

    public static void main(String[] args)
    {
        // Aktuelle Zeit in Nanosekunden bestimmen
        Instant inst1 = Instant.now();

        // 5 Sekunden warten
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Instant inst2 = Instant.now();

        // Vergangene Zit bestimmen
        Duration duration = Duration.between(inst1, inst2);

        System.out.println(String.format("Es sind %s Sekunden vergangen", duration.getSeconds()));
    }

}
