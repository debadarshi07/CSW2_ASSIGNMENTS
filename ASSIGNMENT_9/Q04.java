@FunctionalInterface
interface Shape {
    double area();

    default void printArea() {
        System.out.println("The area is: " + area());
    }
}
public class Q04{
	public static void main(String[] args) {
        Shape circle=() -> {
            double radius=15;
            return Math.PI*radius*radius;
        };

        Shape square=() -> {
            double length=15;
            return length*length;
        };

        Shape rectangle=() -> {
            double width=6;
            double height=13;
            return width*height;
        };
        
        System.out.print("Area of circle: ");
        circle.printArea();

        System.out.print("Area of square: ");
        square.printArea();

        System.out.print("Area of rectangle: ");
        rectangle.printArea();
    }
}