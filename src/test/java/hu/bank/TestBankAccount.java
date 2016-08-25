package hu.bank;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TestBankAccount {

	@Test
	public void testDebitWithSufficientFounds() {
		BankAccount account = new BankAccount(20);
		double balance = account.debit(5);
		Assert.assertEquals(15.0, balance);

	}

}
