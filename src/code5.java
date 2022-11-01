import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class code5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Oct 28 2022 11:30:00 AM 
		
		String input = "Oct 28 2022 11:30:00 AM";
		try {
		    DateTimeFormatter formatter =
		                      DateTimeFormatter.ofPattern("MMM d yyyy HH:mm:ss a");
		    LocalDateTime date = LocalDateTime.parse(input, formatter);
		    System.out.println(date);
		}
		catch (DateTimeParseException exc) {
		    System.out.printf("%s is not parsable!%n", input);
		    throw exc;      // throw the exception.
		}
		
		

	}

}
