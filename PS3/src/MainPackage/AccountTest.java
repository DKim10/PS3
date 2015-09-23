package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {
	//creates new instance of class Account() and InsufficientFundsException
	Account input = new Account();
	InsufficientFundsException e = new InsufficientFundsException(0);
	
	@Test
	//Tests deposit function in class Account()
	//Also sets values for data fields and prints field values
	public final void testdeposit() {
		
		//sets value for balance
		input.setbalance(20000);
		
		//sets value for id
		input.setid(1122);
		
		//sets value for annual interest rate
		input.setannualInterestRate(4.5);
		
		//sets value for date
		input.setdateCreated("9/21/15");
		
		System.out.println("Deposting $3000...");
		input.deposit(3000);
		
		//Test case for deposit function
		assertTrue("This is wrong balance", 23000 == input.getbalance());
		
		//Prints balance
		System.out.printf("Your balance is $%.2f.\n", input.getbalance());
		
		//prints monthly interest
		System.out.printf("Your monthly interest is " + input.getMonthlyInterestRate() + "\n");
		
		//prints date account created
		System.out.printf("Your account was created on " + input.getdateCreated());
	}
	
	@Test
	//Tests withdraw method in class Account()
	public final void testwithdrawl() {
		
		//Sets balance
		input.setbalance(20000);
		
		//try block tests for exception catches if sondition is thrown from Account class
		try
	      {
			System.out.println("\nWithdrawing $2500...");
			input.withdraw(2500);
	         System.out.println("\nWithdrawing $100000...");
	         input.withdraw(100000);
	         System.out.println("\nWithdrawing $600...");
	         input.withdraw(600);
	      }catch(InsufficientFundsException e)
	      {
	         System.out.println(" You are short $" + e.getwithdrawl());
	         e.printStackTrace();
	      }	
	}
	
	

}
