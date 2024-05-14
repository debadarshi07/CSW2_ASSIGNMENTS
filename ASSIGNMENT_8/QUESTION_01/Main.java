package Q01;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(50);
		bst.insert(20);
		bst.insert(40);
		bst.insert(10);
		bst.insert(70);
		bst.insert(30);
		bst.insert(50);
		
		System.out.println(bst.root.info);
		System.out.println(bst.root.left.info);
		System.out.println(bst.root.right.info);
		System.out.println(bst.root.left.left.info);
		System.out.println(bst.root.left.right.info);
	}
}