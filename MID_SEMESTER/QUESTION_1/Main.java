package Q1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Shape c1=new Circle(2.5);
        System.out.println("Area of the Circle is: "+c1.area());
        System.out.println("Perimeter of the Circle is: "+c1.perimeter());
        
        Shape r1=new Rectangle(5.7,3);
        System.out.println("Area of the Rectange is: "+r1.area());
        System.out.println("Perimeter of the Rectangle is: "+r1.perimeter());
	}

}
