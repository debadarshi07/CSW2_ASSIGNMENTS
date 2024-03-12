package Q2;

@SuppressWarnings("rawtypes")
public class Book<T> {

	T bookID,bookName,price;
	
	public Book(T bookID, T bookName, T price) {
		this.bookID=bookID;
		this.bookName=bookName;
		this.price=price;
	}
	
	public String toString() {
		return bookID+"-"+bookName+" costs "+price+"Rs.";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Book) {
			Book b=(Book) o;
			return this.price.equals(b.price);
		}
		return false;
		
	}
}
