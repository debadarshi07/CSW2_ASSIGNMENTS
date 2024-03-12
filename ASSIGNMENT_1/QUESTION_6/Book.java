package Q6;
//@SuppressWarnings("unused")
public class Book extends LibraryResource {

    private int pageCount;

    public Book(String title,String author,int pageCount){
    	super(title,author);
        this.pageCount=pageCount;
    }

    public int getPageCount(){
        return pageCount;
    }
    public void setPageCount(int pageCount){
        this.pageCount=pageCount;
    }

    @Override
    public void displayDetails(){
        System.out.println("\""+this.getTitle()+"\""+" book contains "+this.getPageCount()+" pages.");
    }
}


