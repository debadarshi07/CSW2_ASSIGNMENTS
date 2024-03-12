package Q8;

public class Bicycle implements Vehicle{

	@Override
	public void accelerate() {
		System.out.println("Bicycle is speeding up.");
	}
	
	public void accelerate(String model) {
		System.out.println(model+" cycle is accelerating.");
	}
	
	@Override
	public void brake() {
		System.out.println("Bicycle is applying brakes.");
	}
	
}
