package lab6;

public class Lab6 {

	public static void main(String[] args) {
		Account account1 = new Account(1122, 20000,4.5);
		account1.withdraw(1000);
		account1.deposit(3000);
		System.out.println("Balance is $" + account1.getBalance());
		System.out.println("Monthly interest is :" + account1.getMonthlyInterest() + "%" );
		System.out.println("This account was created at" + account1.getDateCreated());
		
		Checking check = new Checking(1122,20000,4.5);
		check.withdraw(10000);
		check.deposit(3000);
		System.out.println("Account type is :"+check.accountType());
		System.out.println("Balance is $" + check.getBalance());
		System.out.println("Monthly interest is " + check.getMonthlyInterest());
		System.out.println(check.getAlet(10000));
		System.out.println("This account was created at" + check.getDateCreated());

		Savings save = new Savings(1122,20000,4.5);
		save.withdraw(10000);
		save.deposit(3000);
		System.out.println("Account type is :"+save.accountType());
		System.out.println("Balance is $" + save.getBalance());
		System.out.println("Monthly interest is " + save.getMonthlyInterest());
		System.out.println(save.getAlet(10000));
		System.out.println("This account was created at" + save.getDateCreated());
	}

}
