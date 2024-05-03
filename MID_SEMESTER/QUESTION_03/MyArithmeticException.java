package Q3;

@SuppressWarnings("serial")
public class MyArithmeticException extends RuntimeException{
	String message;
	MyArithmeticException(String message){
		super(message);
	}
}
