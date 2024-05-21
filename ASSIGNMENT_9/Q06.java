import java.util.function.Function;
public class Q06 {
    public static Function<Double, Double> getSquare() {
        return (Double x) -> Math.pow(x, 2);
    }
    public static void main(String[] args) {
        Function<Double, Double> square=getSquare();
        double num=15;
        System.out.println("The square of "+num+" is: "+square.apply(num));
    }
}
