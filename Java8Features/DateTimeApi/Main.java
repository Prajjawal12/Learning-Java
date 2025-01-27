package Java8Features.DateTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

//New Date and Time API was introduced in Java8 to address the shortcoming of older java.util.date which were that it was mutable and not thread safe

//Key Components
/*
 *LocalDate
 LocalTime
 LocalDateTime
 ZonalDateTime
 Duration and Period
 */
public class Main {
  public static void main(String[] args) {
    // Localdate
    LocalDate today = LocalDate.now();
    System.out.println(today);

    LocalDate birthDate = LocalDate.of(2002, 02, 12);
    System.out.println(birthDate);

    // LocalTime
    LocalTime time = LocalTime.now();
    System.out.println(time);

    LocalTime meetingTime = LocalTime.of(23, 11, 10);
    System.out.println(meetingTime);

    // LocalDateTime
    LocalDateTime local = LocalDateTime.now();
    System.out.println(local);

    LocalDateTime ltime = LocalDateTime.of(2025, 02, 12, 0, 10, 24);
    System.out.println(ltime);

    // ZonedDateTime
    ZonedDateTime ztime = ZonedDateTime.now(ZoneId.of("America/New_York"));
    System.out.println(ztime);

    ZonedDateTime eventDate = ZonedDateTime.of(2025, 9, 11, 14, 0, 0, 0, ZoneId.of("America/New_York"));
    System.out.println(eventDate);
    // Important Methods
    // Adding and Subtracting date and time
    // Add 10 days
    LocalDate futureDate = today.plusDays(10);
    System.out.println("10 Days Later: " + futureDate);

    // Subtract 2 months
    LocalDate pastDate = today.minusMonths(2);
    System.out.println("2 Months Ago: " + pastDate);

    // Comparing Dates and Time
    LocalDate anotherDate = LocalDate.of(2025, 12, 25);

    // Check if today is before the specified date
    boolean isBefore = today.isBefore(anotherDate);
    System.out.println("Is today before the specified date? " + isBefore);

    // Check if two dates are equal
    boolean isEqual = today.equals(anotherDate);
    System.out.println("Are the dates equal? " + isEqual);

    // Getting Specific components of Date/Time

    LocalDateTime dateTime = LocalDateTime.now();

    // Get year, month, day, hour, minute, second
    int year = dateTime.getYear();
    int month = dateTime.getMonthValue();
    int day = dateTime.getDayOfMonth();
    int hour = dateTime.getHour();
    int minute = dateTime.getMinute();
    int second = dateTime.getSecond();

    System.out.println("Year: " + year);
    System.out.println("Month: " + month);
    System.out.println("Day: " + day);
    System.out.println("Hour: " + hour);
    System.out.println("Minute: " + minute);
    System.out.println("Second: " + second);

    // Using period to find durations
    LocalDate start = LocalDate.of(2020, 1, 1);
    LocalDate end = LocalDate.of(2025, 1, 1);

    Period period = Period.between(start, end);
    System.out.println("Years: " + period.getYears());
    System.out.println("Months: " + period.getMonths());
    System.out.println("Days: " + period.getDays());
  }
}
