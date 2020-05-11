package Bank_Constructor;

public class Bank_Details {

	public double Balance=12000.00;
	public String AccountType="Saving";
	
	public Bank_Details (){
	
	}
	
	
	public Bank_Details(double deposit, String Typeofaccount) {
	
		this.AccountType= Typeofaccount;
		this.Balance=deposit;
	
}
	
	
	
	
	
	
}