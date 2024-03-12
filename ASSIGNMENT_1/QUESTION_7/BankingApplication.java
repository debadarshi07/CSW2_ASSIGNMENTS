package Q7;

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount sa=new SavingsAccount(1234,0);
		sa.withdrawl(34);
		sa.deposit(15000);
		
		System.out.println(sa.getBalance());
		
		SavingsAccount sa2=new SavingsAccount(3456,0);
		sa2.deposit(15000);
		sa2.deposit(15000);
		
		System.out.println(sa.getBalance());
		System.out.println(sa2.getBalance());
	}

}
