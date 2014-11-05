package eu.janietz.java8.streams;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GeneratorDemo {

    public static void main(String[] args)
    {
        // Erzeugt eine Liste aller Zahlen von 0 bis 9
        IntStream.iterate(0, i -> i + 1)
                .limit(10)
                .forEach(System.out::print);

        System.out.println();

		// Erzeugen eines Sream Objekts ohne Collection Zwischenschritt
        Stream.builder()
                .add("Wir ")
                .add("bauen ")
                .add("einen Satz.")
                .build().forEachOrdered(System.out::print);

        System.out.println();

		// Sammlung bekannter Werte/Objekte
        Stream.of(1, 2, 3, 4, 5).forEach(System.out::print);

        System.out.println();

        // 20 zufällige Zahlen generieren
        Stream.generate(() -> Double.valueOf(Math.random() * 100).intValue()).limit(5).forEach(System.out::println);

        try {
            // Zeilen in Text Datei zählen
            long countOfLines = Files.lines(Paths.get(GeneratorDemo.class.getResource("TestFile.txt").toURI())).count();

            System.out.println(String.format("Es befinden sich %s Zeilen in dem Dokument", countOfLines));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }

}
