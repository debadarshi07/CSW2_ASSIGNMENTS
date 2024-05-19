import java.util.function.Function;
public class Q07 {
	public static void main(String[] args) {
		Function<Integer,Integer> factorial=new Function<>() {
			@Override
			public Integer apply(Integer num) {
				if(num==0 || num==1) return 1;
				return num*apply(num-1);
			}
		};
		int num=3;
		System.out.println("Factorial of 3 is: "+factorial.apply(num));
	}
}
