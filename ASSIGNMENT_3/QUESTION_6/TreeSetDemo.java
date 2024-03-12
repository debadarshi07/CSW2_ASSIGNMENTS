package Q06;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<>();
		set.add(15);
		set.add(11);
		set.add(8);
		set.add(45);
		set.add(23);
		set.add(15);

		System.out.println(set);
		
		System.out.println(set.contains(15));
		set.remove(23);
		
		System.out.println(set);
	}
}
