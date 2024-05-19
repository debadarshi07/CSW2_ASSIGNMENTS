public class Q08 {
	public static void main(String[] args) {
		Runnable print=()-> System.out.println( "Hello, CSW2!");
		Thread thread=new Thread(print);
		thread.start();
	}
}