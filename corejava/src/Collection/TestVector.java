package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		Vector v = new  Vector();
		v.add("one");
		v.add(2);
		v.add("three");
		v.add("four");
		v.add("five");
		v.add(6);
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}
		
		
	}
}
