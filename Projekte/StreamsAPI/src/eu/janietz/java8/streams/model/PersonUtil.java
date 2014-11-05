package eu.janietz.java8.streams.model;

import java.util.Arrays;
import java.util.List;

public class PersonUtil {
    public static List<Person> getPersonList()
    {
        return Arrays.asList(
                new Person(3, "Markus", "Wagner", "Deutschland"),
                new Person(2, "Christopher", "Janietz", "Deutschland"),
                new Person(4, "Maria", "Müller", "Österreich"),
                new Person(1, "Homer", "Simpson", "Vereinigten Staaten von Amerika")
        );
    }

    public static List<Person> getOtherPersonList()
    {
        return Arrays.asList(
                new Person(5, "Michael", "Schulz", "Großbritannien"),
                new Person(8, "Leslie", "Stinson", "Frankreich"),
                new Person(7, "Michael", "Michalski", "Schweiz"),
                new Person(6, "Bruce", "Wayne", "Polen")
        );
    }
}
