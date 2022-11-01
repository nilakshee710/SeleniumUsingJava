import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class DateTime_CommonOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.printf("now: %s%n", LocalDateTime.now());

		System.out.printf("Apr 15, 1994 @ 11:30am: %s%n",
		                  LocalDateTime.of(1994, Month.APRIL, 15, 11, 30));

		System.out.printf("now (from Instant): %s%n",
		                  LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));

		System.out.printf("6 months from now: %s%n",
		                  LocalDateTime.now().plusMonths(6));

		System.out.printf("6 months ago: %s%n",
		                  LocalDateTime.now().minusMonths(6));
	
		 //LocalDateTime dt;
		//String datestring = "Oct 28 2022 11:30:00 AM";
		//LocalDate date = LocalDate.parse(datestring, dt );
		
		
			/*
			 * String dInStr = "10-28-2022 11:30:00"; LocalDate d1 =
			 * LocalDate.parse(dInStr,DateTimeFormatter.BASIC_ISO_DATE);
			 * System.out.println("String to LocalDate : " + d1);
			 */  
		//org.joda.time.format.DateTimeFormatter fmt;

        org.joda.time.format.DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss");

        String dateInString = "28/10/2022 11:30:00";
        DateTime dateTime = DateTime.parse(dateInString, formatter);
        System.out.println("String to LocalDate : " +dateTime);
        
        String strInputDateTime;
        // string is populated with a date time string in some fashion
        strInputDateTime="Oct 28 2022 11:30:00 AM";
        DateTime dt = formatter.parseDateTime(strInputDateTime);
        String strOutputDateTime = formatter.print(dt);
        System.out.println("new String to LocalDate : " +strOutputDateTime);
        
	}

}
