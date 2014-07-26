package lab6;

public class Savings extends Account{

	public Savings(int iD, double balance, double aInterestRate) {
		// TODO Auto-generated constructor stub
	}
	public String accountType(){
		return "Savings";
	}
	public int getID(){
		return iD;
	}
	public double getBalance(){
		return balance;
	}
	public double getAnnualinterestRate(){
		this.aInterestRate = this.aInterestRate * 100;
		return aInterestRate;
	}
	public void setID(int id){
		this.iD = id;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void setAnnualInterestRate(double a){
		this.aInterestRate = a;
	}
	public double getMonthlyInterest(){
		this.aInterestRate = this.aInterestRate/12 *100;
		return aInterestRate;
	}
	public java.util.Date getDateCreated(){
		return date;
	}
	public void withdraw(double amount){
		this.balance = this.balance - amount;
	}
	public void deposit(double amount){
		this.balance = this.balance + amount;
	}
	public String getAlet(double amount){
		
		return "Your Funds are low ";
	}
}
