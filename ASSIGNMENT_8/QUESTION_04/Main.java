package Q04;
public class Main {
	public static void main(String[] args) {
		BST world=new BST();
		world.insert(new Country("India",140));
		world.insert(new Country("USA",35));
		world.insert(new Country("Pakistan",25));
		world.insert(new Country("Indonesia",20));
		world.insert(new Country("China",139));
		
		world.levelOrderTraversal();
		System.out.println(world.findMaxPopulation());
		System.out.println(world.findMinPopulation());
	}
}