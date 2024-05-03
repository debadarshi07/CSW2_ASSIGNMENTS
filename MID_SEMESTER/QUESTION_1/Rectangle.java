package Q1;

public class Rectangle implements Shape{
	double length,bredth;

	Rectangle(double length,double bredth){
		this.length=length;
		this.bredth=bredth;
	}

	@Override
	public double area(){
		return length*bredth;
	}

	public int area(int length,int bredth){
		return length*bredth;
	}

	@Override
	public double perimeter(){
		return 2*(length+bredth);
	}

	public int perimeter(int length,int bredth){
		return 2*(length+bredth);
	}

}
