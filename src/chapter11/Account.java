package chapter11;
import java.util.Date;
import java.util.ArrayList;

/*
 * This class creates account object and has setter and getter methods for the data fields. This class also has setter and getter methods for the transaction.
 * @author Ashish Lamichhane
 */
public class Account  {

	private int id ; //stores account id.
	private String name; // stores name of account holder.
	private double balance; // stores the balance. 
	private static double annualInterestRate ; // stores annual interest rate. 
	private  Date dateCreated; // stores the date of account created. 
	private ArrayList<Transaction> transactions = new ArrayList<>(); // creates new arraylist that stores Tranasction objects. 
	
	/*default constructor*/
	public Account(){
		this(0,0);
		this.dateCreated = new Date();
	}
	
	/*constructor that makes an account object when specific id and balance is passed. */
	public Account(int id, double balance){
		this(id,"N/A",balance);
		this.dateCreated = new Date();
	}
	
	/* constructor that makes an account object when specific id, name and balance is passed. */
	public Account(int id, String name, double balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.dateCreated = new Date();
	}

	/*getter method for id*/
	public int getId() {
		return id;
	}

	/*setter method for id */
	public void setId(int id) {
		this.id = id;
	}

	/*getter method for balance*/
	public double getBalance() {
		return balance;
	}

	/*setter method for balance */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/*getter method for annual interest rate.*/
	public double getAnnualInterestRate() {
		return annualInterestRate ;
	}

	/*setter method for annual interest rate */
	public void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	/*getter method for date*/
	public String getDateCreated(){
		return this.dateCreated.toString();
	}
	
	/*getter method for monthly interest rate*/
	public double getMonthlyInterestRate(){
		return ((Account.annualInterestRate /12)/100);
		 	}
	
	/*getter method for monthly interest*/
	public double getMonthlyInterest(){
		return this.balance * this.getMonthlyInterestRate() ;
	}
	
	/*calculates the new balance after the withdraw amount is removed form the present account balance as well as adds the details to the transction arraylist*/
	public void withdraw(double withdrawamount){
		this.balance -= withdrawamount ; 
		transactions.add(new Transaction('W',withdrawamount,balance," "));
		
	}
	
	/*calculates the new balance after the deposit amount is added to the present account balance as well as adds the details to the transction arraylist*/
	public void deposit(double depositamount){
		this.balance += depositamount;
		transactions.add(new Transaction ('D', depositamount, balance," "));
		
	}

	/*getter method for name of the account holder.*/
	public String getName() {
		return name;
	}
	/* setter method for name */
	public void setName(String name) {
		this.name = name;
	}

	/*getter method for Transactions arraylist*/
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	/*setter method for transaction */
	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}
	

}
