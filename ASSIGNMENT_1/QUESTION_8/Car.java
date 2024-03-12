package Q8;

public class Car implements Vehicle{

	@Override
	public void accelerate() {
		System.out.println("Car is accelerating.");
	}
	
	public void accelerate(String model) {
		System.out.println(model+" car is accelerating.");
	}
	
	@Override
	public void brake() {
		System.out.println("Car has been slowed.");
	}
}
