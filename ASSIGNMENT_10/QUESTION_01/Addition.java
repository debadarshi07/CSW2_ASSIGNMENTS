package Q01;
public class Addition implements Runnable{
	double num1,num2;
	Addition(double num1,double num2){
		this.num1=num1;
		this.num2=num2;
	}
	
	@Override
	public void run() {
		System.out.println("Answer of addition: "+(num1+num2));
	}
}