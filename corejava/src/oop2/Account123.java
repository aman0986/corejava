package oop2;

public class Account123 {
	private double balance;
	// setter for balance
	public void setBalance(double balance) {
		this.balance = balance;
	}
	// getter for balance
	public double getBalance() {
		return balance;
		
	}
	// method to withdraw form the account 
	public void withdraw(double amount) {
		if(balance>=2000) {
			balance-= amount;
			System.out.println("Withdrawal current balance:"+ balance);
		}else {
			System.out.println("Insufficient balance for withdrawal.");
		
			
		}
	}
	// method to deposit into the account
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit successful. current balance:"+balance);
		
		
	} 
	
	

}
