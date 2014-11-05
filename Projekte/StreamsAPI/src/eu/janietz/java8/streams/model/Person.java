package eu.janietz.java8.streams.model;


public class Person implements Comparable<Person>
{
    private int id;
    private String name;
    private String firstname;
    private String country;

    public Person(int id, String firstname, String name, String country) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public int compareTo(Person o) {
        return (this.id - o.id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
