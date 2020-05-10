package tutorial.sajal.day2;

public class BankDetails {
	
	private double balance = 1000.00;
	private String acType = "Savings";
	
	
	
	public BankDetails() {
		
	}
	
	public BankDetails(double deposite, String accountType) {
		
		this.balance=deposite;
		this.acType=accountType;
		showAcdetails();
		
	}
	
	
	public void showAcdetails() {
		System.out.println("Your Acount type is "+this.acType +" & your current balance is "+this.balance);
	}
	
	public double getBalance() {
		
		return this.balance;
	}
	
	public String getAccountType() {
		
		return this.acType;
		
	}
	
	
	
	

}
