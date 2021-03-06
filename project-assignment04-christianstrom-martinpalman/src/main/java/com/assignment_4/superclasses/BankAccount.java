package com.assignment_4.superclasses;
import com.assignment_4.interfaces.*;
import java.util.UUID;
public class BankAccount implements BankOperations{
	/**
	 * @author Christian Str�m, Martin P�lman
	 * 
	 */
	private String accountNumber = "";
	private String accountType = "";
	private double balance = 0;
	//Sets a random 6 character hexadecimal number as the account number, sets type and account balance to 0.
	public BankAccount() {
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.accountType = "Bank Account";
		this.balance = 0;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//Withdraws money if the withdrawal amount is a positive double.
	public void withdrawMoney(double amount){
		if (amount >= 0){
			setBalance(getBalance() - amount);
		}else{
			System.out.println("You can not withdraw a negative value!");
		}
	}
	//Same as above, but deposits.
	public void depositMoney(double amount){
		if (amount >= 0){
			setBalance(getBalance() + amount);
		}else{
			System.out.println("You can not deposit a negative value!");
		}
	}
	@Override
	//Prints account info.
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountType=" + accountType + ", balance=" + balance
				+ "]";
	}
}