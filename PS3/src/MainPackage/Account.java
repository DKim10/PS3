package MainPackage;
import java.io.*;

public class Account {
	
	//creates private data field id
	//stores as int
	private int id;
	
	//creates private data field balance
	//stores as double
	private double balance;
	
	//creates private data field annualInterestRate
	//stores as double
	private double annualInterestRate;
	
	//creates private data field dateCreated
	//stores as String
	private String dateCreated;
	
	//Creates default account constructor
	public Account() {
		super();
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0/100;
		}

	//Creates constructor with parameters
	public Account(int id , double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	
	//Creates get method for id
	//returns int id 
	public int getid() {
		return id;
	}
	
	//Creates set method for id
	public void setid(int id)
	{
		this.id = id;
	}
	
	//Creates get method for balance
	//returns double balance
	public double getbalance() {
		return balance;
	}
	
	//Creates set method for id
	public void setbalance(double balance)
	{
		this.balance = balance;
	}
	
	//Creates get method for annualInterestRate
	//returns double annualInterestRate
	public double getannualInterestRate() {
		return annualInterestRate;
	}
	
	//Creates set method for annualInterestRate
	public void setannualInterestRate(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
	}
	
	//Creates get method for dateCreated
	//returns String dateCreated
	public String getdateCreated() {
		return dateCreated;
	}
	
	//Creates set method for id
	public void setdateCreated(String date) {
		this.dateCreated = date;
	}
	
	//Creates get method for MonthlyInterestRate
	//returns double monthly_rate
	public double getMonthlyInterestRate() {
		double monthly_rate = (annualInterestRate/100)/12;
		return monthly_rate;
	}
	
	//Method withdraw withdrawls form balance also checks for exception case
	//Returns: None
	public void withdraw(double withdrawl) throws
	InsufficientFundsException
	{
		if (withdrawl <= this.balance) {
			this.balance -= withdrawl;
		}
		else
		{
			double overdrawn = withdrawl - this.balance;
			throw new InsufficientFundsException(overdrawn);
		}
	}
	
	//Method deposit deposits money into balance
	//Returns:None
	public void deposit(double deposit) {
		this.balance += deposit;
	}
}
