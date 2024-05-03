package Q2;
import java.util.List;
import java.util.ArrayList;

public class CarApp {

	public static void sortCars(List<Car> list){
		for(int i=0;i<list.size();i++){
			for(int j=0;j<list.size()-i-1;j++){
				if(list.get(j).compareTo(list.get(j+1))>0){
					Car temp=list.get(j);
					list.set(j,list.get(j+1));
					list.set(j+1,temp);
				}
			}
		}
	}
	
	public static int searchCar(List<Car> cars,Car target) {
		for(int i=0;i<cars.size();i++){
			if(cars.get(i).equals(target)) return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		
		Car car1 = new Car("BMW", "M3", 10000);
		Car car2 = new Car("Audi", "I10", 100);
		Car car3 = new Car("Maruti","Alto",3555);
		Car car4 = new Car("Honda","City",56632);
		Car car5 = new Car("Hyundai","B12",73837);

		List<Car> carShowroom=new ArrayList<>();

		carShowroom.add(car1);
		carShowroom.add(car2);
		carShowroom.add(car3);
		carShowroom.add(car4);
		carShowroom.add(car5);

		Car target =new Car("Maruti","Alto",3555);
		System.out.println("Targeted Car is present at index: "+searchCar(carShowroom,target));
		

		System.out.println(carShowroom);

		sortCars(carShowroom);
		System.out.println(carShowroom);


	}
}
