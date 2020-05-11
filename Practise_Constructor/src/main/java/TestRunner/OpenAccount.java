package TestRunner;

import java.util.Scanner;

import Bank_Constructor.Bank_Details;

public class OpenAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//BD1.AccountType
		
		

		System.out.println("Heloooo...Please tell us your Name");
		Scanner SC= new Scanner (System.in);
		
		String Name= SC.next();
		
		System.out.println("Welocme" + Name + "Tell us if you would like to go with Default Account Type, Y/N");
		
		String Default_Account_Type_Indicator=SC.next();
		
		if (Default_Account_Type_Indicator.equalsIgnoreCase("N"))
		{
		
			String Account_Type= "CheckIn";
			
			System.out.println("Please eneter your initial Deposit amount");
			double InitialDepositAmount= SC.nextDouble();
			
			Bank_Details BD2=new Bank_Details(InitialDepositAmount, Account_Type);
			
			System.out.println("your account type is " + BD2.AccountType +" Initial Deposit is =" + BD2.Balance );
			
		
			
		}	
		
		else if(Default_Account_Type_Indicator.equalsIgnoreCase("Y")) {
			 
			Bank_Details BD1=new Bank_Details();
			
			System.out.println("default account type" +  BD1.AccountType +" Default balanace" +  BD1.Balance);
			
		}
		
		
		else {
			System.out.println("You have selcted an invalid option. Please start the process all over again.");
			System.exit(0);
		}
		
	}

}
