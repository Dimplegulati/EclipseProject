package dateandtimeapi;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateOperation {
	public static void main(String[] args) {
		LocalDate date= LocalDate.now();
		System.out.println("Current date is "+date);
		LocalTime time=LocalTime.now();
		System.out.println("Current time is "+time);
		
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println("Current date and time is "+datetime);
		Month mon=datetime.getMonth();
		int dayofmonth=datetime.getDayOfMonth();
		DateTimeFormatter format=DateTimeFormatter.ofPattern
				("MM-dd-YYYY HH:MM:SS");
		String formatteddate=datetime.format(format);
		System.out.println("Formatted date is "+formatteddate);
		LocalDateTime specificdate=datetime.withDayOfMonth(23).withMonth(4)
				.withYear(2005);
		System.out.println("Specific date is "+specificdate);
		
		
		
	}

}
