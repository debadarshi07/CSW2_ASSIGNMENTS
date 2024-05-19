import java.util.function.Function;
public class Q06 {
    public static Function<Double, Double> getSquare() {
        return (Double x) -> Math.pow(x, 2);
    }
    public static void main(String[] args) {
        Function<Double, Double> square=getSquare();

        double num1=15;
        double num2=30;
        double num3=112;

        System.out.println("The square of "+num1+" is: "+square.apply(num1));
        System.out.println("The square of "+num2+" is: "+square.apply(num2));
        System.out.println("The square of "+num3+" is: "+square.apply(num3));
    }
}