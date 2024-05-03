package Q1;

public class Circle implements Shape {
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	
	@Override
	public double area(){
		return Math.PI*this.radius*this.radius;
	}

	public double area(int radius){
		return Math.PI*radius*radius;
	}

	@Override
	public double perimeter(){
		return 2*Math.PI*this.radius;
	}
	
	public double perimeter(int radius){
		return 2*Math.PI*radius;
	}

}
