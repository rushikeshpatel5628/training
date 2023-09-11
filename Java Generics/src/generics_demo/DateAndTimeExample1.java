package generics_demo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		LocalDate currentDate = LocalDate.now();
		LocalDateTime currentDateTime = LocalDateTime.now();
		
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	     String formattedDateTime = currentDateTime.format(formatter);
	     System.out.println("Formatted Date and Time: " + formattedDateTime);


	}

}
