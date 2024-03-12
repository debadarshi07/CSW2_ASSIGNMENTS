package Q7;

public abstract class Account {
	
	private int accountNo;
	private double balance;
	
	public Account(int accountNo,double balance) {
		this.accountNo=accountNo;
		this.balance=balance;
	}
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo=accountNo;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	
	public abstract void deposit(double amount);
	public abstract void withdrawl(double amount);
	
}
