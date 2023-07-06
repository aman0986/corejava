import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestStringBuffer {
	public static void main(String[] args) throws ParseException {
		StringBuffer sb = new StringBuffer("10/12/2002");
		String str = sb.toString();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date d = sdf.parse(str);
		System.out.println(str);
		System.out.println(d);
	}
}
