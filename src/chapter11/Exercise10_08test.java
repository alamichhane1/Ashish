package chapter11;

import java.util.ArrayList;

public class Exercise10_08test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Account account = new Account(1122, "George", 1000); // Create new
		// account
		// object.
		account.setAnnualInterestRate(1.5); // set annual interest rate to 1.5
		account.deposit(30); // deposit 30.
		account.deposit(40); // deposit 40.
		account.deposit(50); // deposit 50.

		account.withdraw(5); // withdraw 5.
		account.withdraw(4); // withdraw 4.
		account.withdraw(2); // withdraw 2.

		System.out.println("Name : " + account.getName()); // prints the name of
		// the account
		// holder.
		System.out.println("Annual Interest Rate: "
				+ account.getAnnualInterestRate() + "%"); // prints the interest
		// rate.
		System.out.println("Balance:  $" + account.getBalance()); // prints the
		// account
		// balance.
		System.out.println(); // print empty line.
		System.out.println("All the transaction for account ID "
				+ account.getId() + "are listed below : \n"); // prints accound
		// ID.
		System.out.printf("%-35s%-15s%-15s%-15s\n", "Date of Transaction",
				"Type ", "Amount", "Balance");

		ArrayList<Transaction> transactionlist = account.getTransactions(); // assigns
		// transaction
		// arraylist
		// of
		// account
		// class
		// to
		// transactionlist
		// ararylist.
		/*
		 * Using loop to print the details of the transaction till the end of
		 * the arraylist.
		 */
		for (int i = 0; i < transactionlist.size(); i++) {
			Transaction t = transactionlist.get(i);
			System.out.printf("%-35s%-15s%-15s%-15s\n", t.getDate(),
					t.getType(), "$" + t.getAmount(), "$" + t.getBalance());
		}

	}

}
