package chapter11;

import java.util.Date;

/**
 * This class is designed to store the transaction information for the account.
 * 
 * @version 1.00 01 February 2016 * @author Ashish Lamichhane
 */

public class Transaction {
	private Date date; // stores date.
	private char type; // store the type of transaction.
	private double amount; // store the amount.
	private double balance; // store the balance after transaction.
	private String description; // stores any specific description of the
								// transaction.

	/*
	 * Creates Transaction constructor that requires type, amount, balance and
	 * description to be entered in order to form a transaction object.
	 */
	public Transaction(char type, double amount, double balance,
			String description) {
		this.type = type; // assigns transaction type to "type"
		this.amount = amount; // assigns amount to "amount"
		this.balance = balance; // assigns balance to "balance"
		this.description = description; // assigns description to "description"
		date = new Date(); // creates and assigns current system date to "date"

	}

	/* get method for type */
	public char getType() {
		return type;
	}

	/* set method for type */
	public void setType(char type) {
		this.type = type;
	}

	/* get method for description */
	public String getDescription() {
		return description;
	}

	/* get method for amount */
	public double getAmount() {
		return amount;
	}

	/* set method for amount */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/* get method for balance */
	public double getBalance() {
		return balance;
	}

	/* set method for balance */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/* set method for description */
	public void setDescription(String description) {
		this.description = description;
	}

	/* get method for date */
	public String getDate() {
		return date.toString();
	}
}
