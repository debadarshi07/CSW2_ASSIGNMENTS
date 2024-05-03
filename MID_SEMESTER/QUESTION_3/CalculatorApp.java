package Q3;

public class CalculatorApp {
	public static int sum(int a, int b){
		return a+b;
	}

	public static int subtract(int a, int b){
		try{
			if(a<b) throw new MyArithmeticException("First number must be greater than second.");
			return a-b;
		}catch(MyArithmeticException e){
			System.out.println(e.getMessage());
		}
		return a-b;
	}

	public static int multiply(int a, int b){
		return a*b;
	}

	public static int divide(int a, int b){
		try{
			if(b==0) throw new MyArithmeticException("Can't be divided by zero.");
			return a/b;
		}catch(MyArithmeticException e){
			System.out.println(e.getMessage());
		}
		return -1;
	}
	
	public static void main(String[] args) {

		System.out.println(sum(10,20));
		System.out.println(subtract(1, 2));
		System.out.println(multiply(4, 4));
		System.out.println(divide(3, 0));;
	}
}
