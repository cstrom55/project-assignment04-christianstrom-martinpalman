package com.assignment_4.subclasses;

import com.assignment_4.superclasses.*;
import java.util.UUID;
/**
 * @author Christian Str�m, Martin P�lman
 *
 */
public class PersonalAccount extends BankAccount{
	public PersonalAccount(){
		this.setAccountNumber(UUID.randomUUID().toString().substring(0,6));
		this.setBalance(0.0);
		this.setAccountType("Personal Account");
	}

}
