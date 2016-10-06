package com.assignment_4.subclasses;

import com.assignment_4.superclasses.*;
import java.util.UUID;
/**
 * @author Christian Ström, Martin Pålman
 *
 */
public class SavingsAccount extends BankAccount{
	public SavingsAccount(){
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Savings Account");
	}
}
