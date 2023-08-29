package dateandtimeapi;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;


public class DateTimeData {
	public static void main(String[] args) {
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(2016, 5, 23);
		Period gap=Period.between(date1, date2);
		System.out.println("Gap between two dates are "+gap);
		LocalTime time1=LocalTime.now();
		Duration fivehours=Duration.ofHours(5);
		LocalTime time2=time1.plus(fivehours);
		System.out.println("Time after five hours are "+time2);
		Duration gapdata=Duration.between(time1, time2);
		System.out.println("Gap is "+gapdata);
		LocalDate newyear=date1.plus(2,ChronoUnit.YEARS);
		System.out.println("DATE WTH NEW YEAR"+newyear);
		LocalDate withnewmonths=date1.plus(4,ChronoUnit.MONTHS);
		System.out.println("With new month"+withnewmonths);
		LocalDate firstdayofnextmonth=date1.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("First datay of month is "+firstdayofnextmonth);
		
		
	}

}
