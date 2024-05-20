package Q01;
public class Subtraction implements Runnable{
	double num1,num2;
	Subtraction(double num1,double num2){
		this.num1=num1;
		this.num2=num2;
	}
	
	@Override
	public void run() {
		System.out.println("Answer of subtraction: "+(num1-num2));
	}
}