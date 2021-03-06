package com.assignment_4.subclasses;
import com.assignment_4.superclasses.*;
import java.util.ArrayList;
/**
 * @author Christian Str�m, Martin P�lman
 *
 */
public class BankCustomer extends Human{
	//ArrayList to save the customer's accounts in.
	private ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();
	public BankCustomer(String name, int age) {
		super(name, age);
	}
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
	}
	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}
	public void addAccount(BankAccount bankAccount){
		this.customerAccounts.add(bankAccount);
	}
	//Brings out each account from the arraylist, checks if the accountnumber 
	//matches and uses depositMoney to deposit a certain amount if the amount is not negative.
	public void depositToAccount(String accountNumber, double amount){
		BankAccount bankAccount = null;
		for  (int i = 0; i < customerAccounts.size(); i++){
			bankAccount = customerAccounts.get(i);
			if(bankAccount.getAccountNumber().contains(accountNumber)){
				bankAccount.depositMoney(amount);
			}
		}
	}
	//Same as above, but withdraws.
	public void withdrawFromAccount(String accountNumber, double amount){
		BankAccount bankAccount = null;
		for(int i = 0; i < customerAccounts.size(); i++){
			bankAccount = customerAccounts.get(i);
			if(bankAccount.getAccountNumber().contains(accountNumber)){
				bankAccount.withdrawMoney(amount);
			}
		}
	}
	@Override
	//Prints the name and age of the customer along with his or her accounts' info.
	public String toString() {
		String temp = "";
		for (int i = 0; i < customerAccounts.size(); i++){
			temp += "\n" + customerAccounts.get(i).toString();
		}
		return "Customer: " + getName() + "\tAge: " + getAge() + temp + "\n";
	}	
}