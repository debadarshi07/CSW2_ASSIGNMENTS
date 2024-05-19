import java.util.Scanner;
@FunctionalInterface
interface Calculator {
    double operation(double num1,double num2);
}
public class Q01{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Calculator addition=(num1,num2) -> num1+num2;
        Calculator subtraction=(num1,num2) -> num1-num2;
        Calculator multiplication=(num1,num2) -> num1*num2;
        Calculator division=(num1,num2) -> num1/num2;
        
        System.out.print("Enter num1: ");
        double num1=sc.nextInt();
        System.out.print("Enter num2: ");
        double num2=sc.nextInt();

        System.out.println("Addition: " + addition.operation(num1,num2));
        System.out.println("Subtraction: " + subtraction.operation(num1,num2));
        System.out.println("Multiplication: " + multiplication.operation(num1,num2));
        System.out.println("Division: " + division.operation(num1,num2));
        
        sc.close();
    }
}   
