package generics_demo;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.Instant;
import java.time.Duration;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class DateTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LocalDate, LocalTime, LocalDateTime
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Current Date and Time: " + currentDateTime);

        // ZonedDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Zoned Date and Time: " + zonedDateTime);

        // Instant
        Instant instant = Instant.now();
        System.out.println("Instant: " + instant);
        
        // Duration and Period
        Duration duration = Duration.ofHours(2).plusMinutes(30);
        System.out.println("Duration: " + duration);

        Period period = Period.of(1, 3, 15); // 1 year, 3 months, 15 days
        System.out.println("Period: " + period);

        // Formatting and Parsing
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);

	}

}
