
public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account = new Account(1122,20000,4.5);
		account.withdraw(10000);
		account.deposit(3000);
		System.out.println("Balance is $" + account.getBalance());
		System.out.println("\nMonthly Interest is $" + account.getMonthlyInterest());
		System.out.println("\nThis account was created at " + account.getDateCreated());
		System.out.println(""); 
		
		Checking check = new Checking(1122,20000,4.5);
		check.withdraw(10000);
		check.deposit(3000);
		System.out.println("Account type is " + check.accountType());
		check.balance = account.getBalance() + check.getBalance();
		System.out.println("Balance is $ " + check.getBalance());
		System.out.println("Monthly interest is $ " + check.getMonthlyInterest());
		System.out.println(check.getAlert(10000));
		System.out.println("\nThis account was created at " + check.getDateCreated());
		System.out.println("");
		
		Savings save = new Savings(1122,20000,4.5);
		save.withdraw(10000);
		save.deposit(3000);
		System.out.println("Account type is :"+save.accountType());
		System.out.println("Balance is $" + save.getBalance());
		System.out.println("Monthly interest is " + save.getMonthlyInterest());
		System.out.println(save.getAlet(10000));
		System.out.println("This account was created at" + save.getDateCreated());
			
	}
	
	public int id;
	public double balance, annualinterestRate;
	public java.util.Date date = new java.util.Date();
	
	public Account(){
		
	}
	
	public Account (int id, double balance, double annualinterestRate){
		this.id = id;
		this.balance = balance;
		this.annualinterestRate = annualinterestRate;

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
}
