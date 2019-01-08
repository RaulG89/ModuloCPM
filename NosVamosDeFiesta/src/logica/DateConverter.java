package logica;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {
	
	private DateFormat dateFormat;

	public Date stringToDate(String date) throws ParseException {
		dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		return dateFormat.parse(date);
	}
	
	public String dateToString(Date date) {
		dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		return dateFormat.format(date);
	}
	
}
