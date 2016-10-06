package com.assignment_4.main;
import com.assignment_4.subclasses.*;
import com.assignment_4.superclasses.*;
/**
 * @author Christian Ström, Martin Pålman
 *
 */
public class Main {
	public static void main(String[] args){
		String account = "";
		
		BankCustomer bc = new BankCustomer("Christian", 24);
		bc.addAccount(new BankAccount());
		bc.addAccount(new PersonalAccount());
		bc.addAccount(new SavingsAccount());
		System.out.println(bc.toString());
		
		account = bc.getCustomerAccounts().get(0).getAccountNumber();
		System.out.println("Depositing 30.0 to the first account.");
		bc.depositToAccount(account, 30.0);
		System.out.println(bc.toString());
		
		System.out.println("Withdrawing 200.0 from the second account.");
		account = bc.getCustomerAccounts().get(1).getAccountNumber();
		bc.withdrawFromAccount(account, 200.0);
		System.out.println(bc.toString());
		
		System.out.println("Depositing 200.0 to the third account.");
		account = bc.getCustomerAccounts().get(2).getAccountNumber();
		bc.depositToAccount(account, 200.0);
		System.out.println(bc.toString());
	}
}