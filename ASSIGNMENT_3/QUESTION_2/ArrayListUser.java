package Q02;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListUser {
	private ArrayList<User> users;
	
	public ArrayListUser() {
		this.users=new ArrayList<>();
	}
	
	void add(User user) {
		users.add(user);
	}
	
	void printUsers() {
		for(User user:users) {
			System.out.println("Name:"+user.getName()+", Age:"+user.getAge());
		}
	}
	
	void sortByAge() {
		Collections.sort(users, Comparator.comparingInt(User::getAge));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayListUser users=new ArrayListUser();
		
		users.add(new User("Deb",(byte)26));
		users.add(new User("Rohit",(byte)45));
		users.add(new User("Virat",(byte)18));
		users.add(new User("Shubhman",(byte)77));
		users.add(new User("Ravi",(byte)99));
		
		System.out.println("Before Sorting:");
		users.printUsers();
		
		users.sortByAge();
		System.out.println();
		
		System.out.println("After Sorting:");
		users.printUsers();
		
	}

}
