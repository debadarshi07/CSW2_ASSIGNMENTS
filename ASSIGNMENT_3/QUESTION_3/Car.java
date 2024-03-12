package Q03;

public class Car implements Comparable<Car>{
	private String name;
	private int modelNo,stock;
	
	public Car(String name,int modelNo,int stock){
		this.name=name;
		this.modelNo=modelNo;
		this.stock=stock;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo=modelNo;
	}
	
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock=stock;
	}
	
	public int compareTo(Car other) {
		return Integer.compare(this.stock, other.stock);
	}
	
	public String toString() {
		return "Name:"+this.getName()+", ModelNo:"+this.getModelNo()+", Stock:"+this.getStock();
	}
}
