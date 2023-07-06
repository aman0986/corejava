package collectionframwork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestPerson {

	public static void main(String[] args) {

		Person p1 = new Person(1, "aman");
		Person p2 = new Person(2, "gupta");
		Person p3 = new Person(3, "super");

		List list = new ArrayList();

		list.add("one");
		list.add(100);
		list.add("two");
		list.add(p1);
		list.add(p2);
		list.add(101);
		list.add(p3);

		Person p = (Person) list.get(3);

		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(","+"###########"+",");
		
		System.out.println(list);
		System.out.println(" ,"+p.getId()+" ,"+ p.getName()+" ,");
		

	}

}

