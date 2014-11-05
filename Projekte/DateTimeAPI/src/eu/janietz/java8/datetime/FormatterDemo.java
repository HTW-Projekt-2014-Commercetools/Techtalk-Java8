package eu.janietz.java8.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatterDemo {

    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
		// Standardformat
        DateTimeFormatter formatterSimple = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		// Individuelles Format
        DateTimeFormatter formatterCustom = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.println(String.format("Heute ist folgendes Datum: %s", formatterSimple.format(date)));
        System.out.println(String.format("Heute ist folgendes Datum: %s", formatterCustom.format(date)));
    }

}
