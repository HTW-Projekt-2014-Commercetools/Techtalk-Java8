package eu.janietz.java8.streams;

import eu.janietz.java8.streams.model.Person;
import eu.janietz.java8.streams.model.PersonUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args)
    {
        List<Person> persons = PersonUtil.getPersonList();

		// Erzeugen eines Arrays mit Typbestimmung
        Person[] personArray = persons
                .stream()
                .filter(p ->
                        p.getFirstname()
                        .startsWith("M"))
                .toArray(Person[]::new);
        System.out.println(Arrays.toString(personArray));


		// Erzeugen eines Collection Objektes
        List<Person> personList = persons
                .stream()
                .filter(p ->
                        p.getFirstname()
                        .startsWith("C"))
                //.collect(Collectors.toList()) // Direktes erzeugen einer Liste
                .collect(Collectors.toCollection(ArrayList::new));
        for (Person p : personList) System.out.println(p);

		// Terminierung des Streams mit forEach
        persons
                .stream()
                .filter(p ->
                        p.getFirstname()
                        .startsWith("H"))
                .forEach(System.out::println);

    }

}
