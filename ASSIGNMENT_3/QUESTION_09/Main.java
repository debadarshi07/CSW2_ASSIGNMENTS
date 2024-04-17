package Q09;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		
		int arr[]= {1,2,5,3,1,8,5,0,1,8,5,2};
		
		HashSet<Integer> numbers=new HashSet<>();
		HashSet<Integer> repeatedNumbers=new HashSet<>();
		
		for(int element:arr) {
			if(!numbers.add(element)) {
				repeatedNumbers.add(element);
			}
		}
		
		System.out.println("Repeated elements are:");
		for(int element:repeatedNumbers) {
			System.out.print(element+" ");
		}
		
	}
}
