package eu.janietz.java8.streams;

import eu.janietz.java8.streams.model.Person;
import eu.janietz.java8.streams.model.PersonUtil;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AggregationDemo {

    public static void main(String[] args)
    {
        List<Person> persons = PersonUtil.getPersonList();

		// Person mit der kleinsten Id -> Maximal Wert
        persons.stream()
                .max((p1, p2) -> p2.getId() - p1.getId())
                .ifPresent(System.out::println);

		// 10 zufällige Zahlen -> Die größte von Diesen
        IntStream
                .rangeClosed(1, 10)
                .map((i) -> Double.valueOf(Math.random() * 100).intValue())
                .max() //.min
                    .ifPresent((i) -> System.out.println("Die größte generierte Zahl ist: " + i));

        // Alle verschiedenen Länder
        String countries = persons.stream().map(Person::getCountry).distinct().collect(Collectors.joining(", "));
        System.out.println("Länder: " + countries);


        // Sortierung mit Comparable/Comparator
        persons.stream().sorted().forEach(System.out::println);

        // Anzahl an Personen im Stream
        System.out.println("Anzahl an Personen: " + persons.stream().count());

		// Länder mit zugehöriger Anzahl Personen
        persons.stream().collect(Collectors.groupingBy(Person::getCountry, Collectors.counting())).forEach(
                (country, count) -> System.out.println(String.format("Land: %s | Anzahl %s", country, count))
        );

        // Anforderung: Alle Personen aus dem Land mit den meisten Einträgen
        persons.stream()
                .collect(Collectors.groupingBy(Person::getCountry, Collectors.counting()))
                .entrySet()
                .stream()
                // Eintrag mit maximaler Anzahl bestimmen
                .max(Comparator.comparingInt(e -> e.getValue().intValue())).ifPresent(
                // Aus dem größten Land alle zugehörigen Personen heraussuchen
                biggestCountry -> persons.stream()
                        .filter(person -> person.getCountry()
                                .equals(biggestCountry.getKey()))
                        .forEach(System.out::println)
        );


    }

}
