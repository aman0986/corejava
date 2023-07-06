import cloning.Account;

public class customer implements Cloneable {
	public String name = null;
	public Account account = null;

	public customer(String n, int i) {
		name = n;
		account = new Account(i);

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		customer c = (customer) super.clone();
		c.account=account.clo

		return c;
	}

}
