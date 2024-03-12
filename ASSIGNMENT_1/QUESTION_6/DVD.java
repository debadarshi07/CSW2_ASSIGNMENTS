package Q6;

public class DVD extends LibraryResource {
	
	private String duration;
	
	public DVD(String title,String author,String duration) {
		super(title,author);
		this.duration=duration;
	}
	
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration=duration;
	}
	
	@Override
	public void displayDetails() {
		System.out.println("\""+this.getTitle()+"\""+" DVD has been issued for "+this.getDuration()+".");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
