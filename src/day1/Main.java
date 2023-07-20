package day1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		//API time(packge time) de java 8
		// 1)Creating date and time
		
		//LocalDate ld = LocalDate.now();
		System.out.println("Creating date and time");
		LocalDate ld = LocalDate.of(1998, 9, 20);
		LocalTime lt = LocalTime.of(10, 15);
		System.out.println(ld);
		//System.out.println(lt);
		//LocalDateTime ldt = LocalDateTime.of(ld, lt);
		//System.out.println(ldt);
		// 2)Manipulating
		System.out.println("Manipulating");
		//System.out.println(ld.plusDays(2));
		//ld = ld.plusDays(2);
		//System.out.println(ld);
		
		Period period = Period.of(2, 3, 4);		
	    ld = ld.plus(period);
	    System.out.println(ld);
	    System.out.println(period);
	    
	    Duration duration = Duration.of(45,ChronoUnit.MINUTES);
	    System.out.println(duration);
	    lt = lt.plus(duration);
	    System.out.println(lt);
		//Immutable vs Mutable
		
		/*String word = "formation";
		System.out.println(word.concat("-ocp"));
		System.out.println(word);
		StringBuilder sb = new StringBuilder("formation");
		sb.append("-ocp");
		System.out.println(sb);*/
		// 3)Formating
	    
	    DateTimeFormatter fm = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
	    DateTimeFormatter fl = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
	    DateTimeFormatter ff = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
	    LocalDate date = LocalDate.now();
	    //LocalTime date = LocalTime.now();
	    System.out.println(date);
	    System.out.println(date.format(fm));
	    System.out.println(date.format(fl));
	    System.out.println(date.format(ff));
	    
	    DateTimeFormatter custom_format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    System.out.println(date.format(custom_format));
		// 4)Zone Date Time

	}

}
