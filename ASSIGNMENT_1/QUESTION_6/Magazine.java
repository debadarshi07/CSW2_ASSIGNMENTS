package Q6;

public class Magazine extends LibraryResource {
	
	private String issueDate;
	
	public Magazine(String title,String author,String issueDate) {
		super(title,author);
		this.issueDate=issueDate;
	}
	
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate=issueDate;
	}
	
	@Override
	public void displayDetails() {
		System.out.println("\""+this.getTitle()+"\""+" magazine has been issued on "+this.getIssueDate()+".");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
