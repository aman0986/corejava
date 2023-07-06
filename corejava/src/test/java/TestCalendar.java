package test.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String str = "20/11/2022";
		Date today = new Date();
		Object calendar;
		Calendar cal =Calendar.getInstance();
		cal.setTime(sdf.parse(str));
		for (int i = 1; i <=12; i++) {
		cal.add(Calendar.DATE,30);	
		System.out.println((sdf.format(cal.getTime())));
			
		}
		
}

}
