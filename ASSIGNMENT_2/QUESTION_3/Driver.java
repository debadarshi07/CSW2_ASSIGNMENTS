package Q3;

public class Driver {
	public static void main(String[] args) {
		
		Car car1=new Car("Alto","blue",200);
		Car car2=new Car("Nano","gray",150);
		
		if(car1.compareTo(car2)==1) {
			System.out.println(car1);
		}else if(car1.compareTo(car2)==-1) {
			System.out.println(car2);
		}else {
			System.out.println("Both the cars have the same speed.");
		}
	}
}
