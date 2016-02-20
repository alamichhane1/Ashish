package chapter10;

import java.util.Scanner;

import chapter11.Account;

/**
 * This class is designed display the menu in a repetitive pattern to perform
 * certain account related functions. This class asks user to enter an id and
 * checks if the id is valid or not. Then depending upon the result the menu is
 * displayed. User can, then, enter his choice and peform the task depending
 * upon his choice. This is never ending program. Once the user tries to exit
 * the program asks the user to enter the id again.
 * 
 * @version 1.00 24 Jan 2016 * @author Ashish Lamichhane
 */
public class Exercise10_07 {

	public static void main(String[] args) {
		int id;
		Account[] account = new Account[10]; // Create new account array.
		for (int i = 0; i < 10; i++) {
			account[i] = new Account(i, 100); // assign new account object with
												// an id of value same as i and
												// initial balance of 100.
		}
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); // Scanner to input the id from
												// user.
		System.out.print("Enter an id: ");
		id = input.nextInt(); // Assign the next integer value entered to id
								// variable.
		enter(id,account[id]); // Calls enter method.

	}

	/*
	 * Create a method to display the menu.
	 */
	public static void displayMenu() {
		/* Print out the Menu in order. */
		System.out
				.print(String
						.format("Menu \n 1. Check Balance \n 2. Withdraw  \n 3. Deposit  \n 4.Exit \n"));

	}

	/*
	 * Create a method to perform the function of menu such as checking balance,
	 * withdrawing amount, depositing amount.
	 */
	public static void calculation(int id, Account account) {
		int choice;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); // Create Scanner to input the
												// choice and amounts.

		System.out.print("Enter your choice : ");
		choice = input.nextInt(); // Assign next integer to choice variable.

		switch (choice) {
		/* Check choice and execute the statements depending upon its value. */
		case 1:
			System.out.println("The balance is " + account.getBalance()); // Display
																			// current
																			// balance.
			break;

		case 2:
			System.out.print("Enter the amount to withdraw:");
			double withdrawamount = input.nextDouble(); // Assign next double
														// value to
														// withdrawamount
														// variable.
			account.setBalance(account.withdraw(withdrawamount)); // Set new
																	// balance
																	// after
																	// withdrawal.
			break;

		case 3:
			System.out.print("Enter the amount to deposit: ");
			double depositamount = input.nextDouble(); // Assign next double
														// value to
														// depositamount
														// variable.
			account.setBalance(account.deposit(depositamount)); // Set new
																// balance after
																// deposit.
			break;

		case 4:
			System.out.print("Enter an id : ");
			id = input.nextInt();
			enter(id,account);
		}

	}

	/*
	 * Create a method to ask for the id from the user and check the id.
	 */
	public static void enter(int id,Account account) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);

		if (id < 0 || id > 9) {
			/*
			 * Checks if the id is smaller than 0 or greater than 9 and prompts
			 * the user to re-enter the correct id if the result is true.
			 */
			System.out
					.print("Please enter the correct id i.e between 0 and 9: ");
			id = input.nextInt(); // Assign next integer value to id variable.
			displayMenu(); // Calls displayMenu method.
			calculation(id, account); // Calls calculation method by passing
											// id and account as arguments.
		}

		while (id > 0 && id < 9) {
			/*
			 * Iterative program to continue the program till the condition, id
			 * is greater than zero and smaller than nine, matches.
			 */
			displayMenu(); // Calls displayMenu method. 
			calculation(id, account); // Calls calculation method by passing
											// id and account as arguments.
		}
	}

}
