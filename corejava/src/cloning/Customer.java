package cloning;

public class Customer implements Cloneable{
	public String name = null;
	public Account account = null;
	public Customer(String n) {
		name = n;
		account = new Account(10);
	}
	public Object clone() throws CloneNotSupportedException{
		Customer c = (Customer)super.clone();
		account = (Account) account.clone();
		return c;
	}

}
