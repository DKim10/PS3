package MainPackage;
import java.io.*;

//Custom class InsufficientFundsException
public class InsufficientFundsException extends Exception 
{
	//private datat filed withdrawl
	private double withdrawl;
	
	public InsufficientFundsException(double withdrawl) {
		this.withdrawl = withdrawl;
	}
	
	public double getwithdrawl() {
		return withdrawl;
	}
}
