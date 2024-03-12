package Q2;

public class Main {
	@SuppressWarnings({"rawtypes", "unchecked"})
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1=new Book(25,"Human Nature",500);
		Book book2=new Book("30a","Artificial Intelligence",5000);
		
		System.out.println(book1);
		System.out.println(book2);
		
		System.out.println(book1.equals(book2));
//		System.out.println(book2 instanceof Book);
	}

}
