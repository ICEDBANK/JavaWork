package lab6;

public class Account {
	
	public int iD;
	public double balance, aInterestRate;
	public java.util.Date date = new java.util.Date();
	

	
public Account(){
	
}
public Account(int iD, double balance, double aInterestRate){
	
	this.iD = iD;
	this.balance = balance;
	this.aInterestRate = aInterestRate;

}
public int getID(){
	return iD;
}
public double getBalance(){
	return balance;
}
public double getAIR(){
	return aInterestRate/100;
}
public void setID(int id){
	this.iD = id;
}
public void setBalance(double b){
	this.balance = b;
}
public void setAIR(double a){
	this.aInterestRate = a;
}
public double getMonthlyInterest(){
	this.aInterestRate = this.aInterestRate/12 *100;
	return aInterestRate;
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