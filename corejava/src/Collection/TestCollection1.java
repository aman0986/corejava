package Collection;

public class TestCollection1 {

	public static void main(String[] args) {
		Person p1 = new Person(1, "aman");
		Person p2 = new Person(1, "aman");
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());


	}

}
