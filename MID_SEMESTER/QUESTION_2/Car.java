package Q2;

public class Car implements Comparable<Car>{
	String name,modelNo;
	double price;

	Car(String name,String modelNo,double price){
		this.name=name;
		this.modelNo=modelNo;
		this.price=price;
	}

	@Override
	public int compareTo(Car o) {
		if(this.price>o.price) return 1;
		if(this.price<o.price) return -1;
		return 0;
	}

	@Override
	public boolean equals(Object o){
		if(o instanceof Car){
			Car c=(Car)o;
			return this.name.equals(c.name) && this.modelNo.equals(c.modelNo) && this.price==c.price;
		}
		return false;
	}

	@Override
	public String toString(){
		return name+" "+modelNo+" "+price;
	}
}
