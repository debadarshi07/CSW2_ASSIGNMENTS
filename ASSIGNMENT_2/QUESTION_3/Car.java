package Q3;

public class Car implements Comparable<Car>{
	String model,color;
	double speed;
	
	Car(String model,String color,double speed){
		this.model=model;
		this.color=color;
		this.speed=speed;
	}
	
	@Override
	public int compareTo(Car o) {
		return Double.compare(this.speed, o.speed);
	}
	
	@Override
	public String toString() {
		return "Car model:"+this.model+", color:"+this.color+", Speed:"+this.speed+"km/h";
	}
}
