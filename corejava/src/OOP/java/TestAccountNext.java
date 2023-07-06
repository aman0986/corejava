package OOP.java;

public class TestAccountNext {
	public static void main(String[] args) {
		Account a = new Account();
		a.setBalance(7890);
		a.setAccountNumber("sbi01455");
		a.deposit(6000);
		a.setcolour("black");
		a.withdrawl(500);
		System.out.println(a.getBalance());
		System.out.println(a.getAccountNuber());
		System.out.println(a.getcolour());
		System.out.println(a.getBalance());
		
	}

}
