package Exp;

import java.util.Scanner;

class WithdrawException extends Exception{
	static double balance;
	//double Wbal;
	private String msg;
	public WithdrawException(String msg)
	{
		this.msg=msg;
		//super(msg);
	}
	static void withdraw(double bal) throws WithdrawException
	{
		//try {
			balance=25000.0;
			
		if(balance>bal) {
			System.out.println("remaining bal: "+(balance-bal));
		}
		else {
			System.out.println("Insufficent balance");
			throw new WithdrawException("Insufficient balance");
		}
			
	//}catch(WithdrawException e)
		//{
		//e.printStackTrace();
		//}
		
	}
}
public class Exception1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter amount need to withdraw");
		double amnt= sc.nextDouble();
		
			//WithdrawException.withdraw(amnt);
			 try{
			WithdrawException.withdraw(amnt);
			
		}catch(WithdrawException e)
		{
		e.printStackTrace();
	

   }
	}
 }
