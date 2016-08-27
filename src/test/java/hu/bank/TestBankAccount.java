package hu.bank;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TestBankAccount {

	@Test
	public void testDebitWithSufficientFounds() {
		BankAccount account = new BankAccount(20);
		double amount = account.debit(5);
		Assert.assertEquals(5.0, amount);
	}
	
	@Test
	public void testDebitWithInSufficientFounds() {
		BankAccount account = new BankAccount(20);
		double amount = account.debit(30);
		Assert.assertEquals(20.0, amount);
	}
}
