package collectionframwork;


import java.util.ArrayList;
import java.util.Collection;

public class TestCollection{
	public static void main(String[] args) {
		Collection list = new ArrayList();
		list.add("aman");
		list.add(100);
		list.add("super aman");
		list.add("super");
	System.out.println(list);
	Collection ram = new ArrayList();
	ram.add("101");
	ram.add("102");
	ram.add("103");
	ram.add(104);
	
	System.out.println(list);
	System.out.println(ram);
	list.addAll(ram);
	System.out.println(list);
	}
}