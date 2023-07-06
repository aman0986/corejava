package cloning;

public class Account implements Cloneable {
	double balance = 0;

	public Account(double b) {
		balance = b;

	}

	// @Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}