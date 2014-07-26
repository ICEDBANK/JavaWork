
public class Savings extends Account{

	public Savings(int id, double balance, double annualinterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualinterestRate = annualinterestRate;
	}
	public String accountType(){
		return "Savings";
	}
	public int getID(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public double getAIR(){
		return annualinterestRate/100;
	}
	public void setID(int id){
		this.id = id;
	}
	public void setBalance(double b){
		this.balance = b;
	}
	public void setAIR(double a){
		this.annualinterestRate = a;
	}
	public double getMonthlyInterest(){
		this.annualinterestRate = this.annualinterestRate/12 /100;
		this.annualinterestRate = this.balance * this.annualinterestRate;
		return annualinterestRate;
	}
	public void withdraw(double amount){
		this.balance = this.balance - amount;
	}
	public void deposit(double amount){
		this.balance = this.balance + amount;
	}
	public java.util.Date getDateCreated(){
		return date;
	}
	public void setDateCreated(java.util.Date date){
		this.date = date;
	}
	public String getAlet(double amount){
		
		return "Your Funds are low ";
	}
}

