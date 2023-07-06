package oop2;

public class TestAccount1 {
    public static void main(String[] args) {
        Account1 account1 = new Account1(123456, "John Doe", 1000.0);
        account1.deposit(5000.0);
        account1.withdraw(200.0);

        Account1 account2 = new Account1(789012, "Jane Smith", 2000.0);
        account2.deposit(1000.0);
        account2.withdraw(800.0);
       
        Account1 account3 = new Account1(789012, "Jane Smithe", 2000.0);
        account3.deposit(1000.0);
        account3.withdraw(3000.0);
   }
}


