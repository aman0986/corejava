package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import collectionframwork.Person;


public class TestCollection{
	public static void main(String[] args) {
	
		Person p1 = new Person(1, "aman");
		Person p2 = new Person(2, "Gupta");
		
		List list = new ArrayList();
		
		list.add("one");
		list.add(100);
		list.add("Three");
		list.add(200);
		list.add(p1);
		list.add(p2);
		//for (Object object : list) {
			//System.out.println(object);
		for (int i = 0; i < list.size(); i++) {
		Iterator it =list.iterator();
		while (it.hasNext()){	
			System.out.println(it.next());
			//Person  p= (Person) it.next();
			//System.out.println(p.getId());
			//System.out.println(p1.getName());
		}
		
			
		}
			
		}
	}
