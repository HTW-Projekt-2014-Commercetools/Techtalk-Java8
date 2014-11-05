package eu.janietz.java8.datetime;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalQueries;
import java.util.Calendar;
import java.util.Date;

public class LegacySupport {

    public static void main(String[] args)
    {
        Date dateTime = new Date();
		// Date in Instant umwandeln
        System.out.println("Aktuelle Zeit(von Date): " + dateTime.toInstant());
		// Instant in LocalDateTime umwandeln
        System.out.println("Aktuelle Zeit (von Date umgewandelt): " +
                LocalDateTime.ofInstant(dateTime.toInstant(), ZoneId.systemDefault()));

		// Calendar in Instant umwandeln
        Calendar calendar = Calendar.getInstance();
        System.out.println("Aktuelle Zeit (von Calendar): " + calendar.toInstant());

		// Timestamp in LocalDateTime
        Timestamp timestamp = new Timestamp(1);
        LocalDateTime timestampLDT = timestamp.toLocalDateTime();
        System.out.println("1 Millisekunde von 1970 aus (von Timestamp): " + timestampLDT.toString());
    }


}
