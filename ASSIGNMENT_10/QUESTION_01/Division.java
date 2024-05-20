package Q01;
public class Division implements Runnable{
	double num1,num2;
	Division(double num1,double num2){
		this.num1=num1;
		this.num2=num2;
	}
	
	@Override
	public void run() {
		try {
			if(num2==0) throw new ArithmeticException("Divisor can't be zero.");
			System.out.println("Answer of division: "+(num1/num2));
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
