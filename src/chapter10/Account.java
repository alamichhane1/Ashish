package chapter10;
import java.util.Date;

public class Account {

	private int id ;
	private static double balance;
	private double annualInterestRate ;
	private  Date dateCreated;
	
	public Account(){
		this(0,0);
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}
	
	public Account(int id, double balance){
		this.id = id;
		Account.balance = balance ;
		annualInterestRate = 4.5 ;
		this.dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		Account.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public String getDateCreated(){
		return this.dateCreated.toString();
	}
	
	public double getMonthlyInterestRate(){
		return ((this.annualInterestRate /12)/100);
		 	}
	
	public double getMonthlyInterest(){
		return Account.balance * this.getMonthlyInterestRate() ;
	}
	
	public double withdraw(double withdrawamount){
		Account.balance = Account.balance - withdrawamount ; 
		return Account.balance;
	}
	
	public double deposit(double depositamount){
		Account.balance = Account.balance + depositamount;
		return Account.balance;
	}
	

}
