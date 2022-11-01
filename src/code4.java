import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class code4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dateInString = "October 28,2022 11:30:00";
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, d MMM yyyy", Locale.ENGLISH);
		//LocalDate dateTime = LocalDate.parse(dateInString, DateTimeFormatter.ISO_DATE);
		//System.out.println(dateTime);
		
		
		 String oldstring = "October 28, 2022 11:30:00";
		 DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		 Date mydate= new Date();
		try {
			mydate = format.parse(oldstring);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println(mydate);
		 
	}

}
