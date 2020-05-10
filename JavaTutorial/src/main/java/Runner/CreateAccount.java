package Runner;

import java.util.Scanner;

import tutorial.sajal.day2.BankDetails;

public class CreateAccount {

	public static void main(String[] args) {
		
		System.out.println("Tell us your name...");
		Scanner sc= new Scanner(System.in);
		String name=sc.next();
		System.out.println("Hello "+name+ ", What kind of account do you want to open with our back please selct Checking or Saving (C/S) ?");
		String acType=sc.next();
		
		if(acType.equalsIgnoreCase("c")) {
			acType="Checkin";
			
		}
		
		else if(acType.equalsIgnoreCase("s")) {
			acType="Savings";
		}
		else {
			System.out.println("You have selcted an invalid option. Please start the process all over again.");
			System.exit(0);
		}
		
		System.out.println("What is your intial deposite amount?");
		
		double depositeAmt=sc.nextDouble();
		
		BankDetails bd1= new BankDetails();
		BankDetails bd2= new BankDetails(depositeAmt, acType);
		
		System.out.println("default Accouint Type is "+bd1.getAccountType());
		System.out.println("default Account balance is $"+bd1.getBalance());
		
		
		System.out.println(name+"'s Accoiunt type is "+bd2.getAccountType());
		System.out.println(name+"'s Accoiunt balance is  $"+bd2.getBalance());
		

	}

}
