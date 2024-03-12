package Q11;
import java.util.HashMap;

public class Main {
	public static int findSmallestPositive(int arr[]) {
		HashMap<Integer,Integer> record=new HashMap<>();
		
		for(int element:arr) {
			record.put(element, 1);
		}
		
		for(int i=1;i<=10;i++) {
			if(!record.containsKey(i)) {
				return i;
			}
		}
		return 11;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]= {1,9,8,2,5,7,6,4};
		
		System.out.println(findSmallestPositive(array));
		
	}

}
