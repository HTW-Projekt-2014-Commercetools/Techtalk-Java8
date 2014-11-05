package eu.janietz.java8.streams;

import eu.janietz.java8.streams.model.Person;
import eu.janietz.java8.streams.model.PersonUtil;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CombineShortenDemo {

    public static void main(String[] args)
    {
        List<Person> persons = PersonUtil.getPersonList();

        // Komma separierte Liste aller Vornamen
        persons.stream().map(Person::getFirstname).collect(Collectors.joining(", "));

        // Personen mit dem Anfangsbuchstaben M im Vornamen
        persons.stream().filter(p -> p.getFirstname().startsWith("M")).forEach(System.out::println);

        // 5 Zahlen aus 10
        IntStream.rangeClosed(1, 10).skip(5).forEach(System.out::print);

        System.out.println();

        // Rekursive Quadrate der Zahlen von 2 aus, maximal aber 5 Zahlen
        IntStream.iterate(2, i -> i * i).limit(5).forEach(System.out::println);

		// Aufsummierung aller Zahlen bis 100
        IntStream.rangeClosed(1, 100).reduce((int1, int2) -> int1 + int2).ifPresent(System.out::println);
    }

}
