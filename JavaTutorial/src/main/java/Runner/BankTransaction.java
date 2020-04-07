package Runner;

import java.util.Scanner;

import BankTransaction.BankAccount;

public class BankTransaction {
	
	 

	public static void main(String[] args) {
		int balance = 0;
		int transactionAmt=0;
		
		BankAccount ba=new BankAccount();
		
		
		System.out.println("Your current balance is "+ba.getBalance());
		System.out.println("Do you want to perform a transaction (W/D)");
		Scanner sc = new Scanner(System.in);
		
		String userAction=sc.next();
		if(userAction.equalsIgnoreCase("W")) {
			
			System.out.println("You have selected 'Withdrawal' option , Please enter withdrawal amount");
			transactionAmt=sc.nextInt();
			balance=ba.performTransaction(transactionAmt,false);
			if(balance<0) {
				System.out.println("You have "+ba.getBalance()+ " in your Bank account. You cannot withdraw "+transactionAmt);
			}
			
			else {
				System.out.println("You curent balance is  "+ba.getBalance());
			}
			
		}
		else if(userAction.equalsIgnoreCase("D")) {
			System.out.println("You have selected 'Deposite' option, Please enter Deposite Amount ");
			transactionAmt=sc.nextInt();
			balance=ba.performTransaction(transactionAmt,true);
			System.out.println("Your current balance is "+ba.getBalance());
			
			
		}
		else {
			System.out.println("You have made an invalid choice . Please select (W/D)");
		}

	}

}
