package Q6;

public class LibrarySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book=new Book("The Dictator Debadarshi","Adolf Hitler and Mao Zedong",3000);
		book.displayDetails();
		
		Magazine magazine=new Magazine("Unbeaten Debadarshi","Saddam Hussain","07.03.2024");
		magazine.displayDetails();
		
		DVD dvd=new DVD("Debadarshi:The Ruler","Kim Jung Un","3 months");
		dvd.displayDetails();
		
	}

}
