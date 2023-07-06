package oop2;
import OOP.java.Account;
public class TestAccount123 {
	public static void main(String[] args) {
		//create an instance of the account class
		Account123 myAccount = new Account123();
		// set the initial balance
		myAccount.setBalance(3000);
		double Intialbalance = myAccount.getBalance();
		System.out.println("Initial Balance"+ Intialbalance);
		myAccount.withdraw(100);
		myAccount.deposit(500);
		//get the current balance
		double currentBalance = myAccount.getBalance();
		System.out.println("current balance:"+ currentBalance);
	}

}
