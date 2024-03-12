package Q7;

public class SavingsAccount extends Account{
	
	final double interestRate=7.5;
	
	public SavingsAccount(int accountNo, double balance) {
		super(accountNo,balance);
	}
	
	@Override
	public void deposit(double amount) {
		setBalance(amount+getBalance());
		System.out.println("Interest is:"+0.075*amount);
	}
	
	@Override
	public void withdrawl(double amount) {
		if(amount>getBalance()) {
			System.out.println("Insufficient balance.");
		}else {
			setBalance(getBalance()-amount);
		}
	}

}
