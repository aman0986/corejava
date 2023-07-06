package cloning;

public class TestAccount {

	public static void main(String[] args) throws CloneNotSupportedException {
	Customer c1=new Customer("Aman");
	Customer c2=(Customer) c1.clone();
	c2.name="Ammu";
	System.out.println(c2.name);
	System.out.println(c1.name);
	c2.account.balance=11;
	System.out.println(c2.account.balance);
	System.out.println(c1.account.balance);

	}

}
