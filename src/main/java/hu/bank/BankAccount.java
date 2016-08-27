package hu.bank;


public class BankAccount {
	private double balance;

	public BankAccount(long balance) {
		this.balance = balance;
	}

	public double debit(double amount) {
		if (balance < amount) {
			amount = balance;
		}

		balance -= amount;
		return amount;
	}

}
