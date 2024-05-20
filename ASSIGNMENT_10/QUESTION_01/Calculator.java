package Q01;
public class Calculator{
	public static void main(String[] args) {
		double num1=25,num2=50;
    
		Thread addition=new Thread(new Addition(num1,num2));
		Thread subtraction=new Thread(new Subtraction(num1,num2));
		Thread multiplication=new Thread(new Multiplication(num2,num1));
		Thread division=new Thread(new Division(num2,num1));

		addition.start();
		subtraction.start();
		multiplication.start();
		division.start();
	}
}
