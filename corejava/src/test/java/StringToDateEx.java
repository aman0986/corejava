package test.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateEx {

	public static void main(String[] args) throws ParseException {
		String a= "10/11/2022";
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
		Date date =s.parse(a);
		System.out.println(date);
		

	}

}
