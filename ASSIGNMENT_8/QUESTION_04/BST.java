package Q04;
import java.util.LinkedList;
import java.util.Queue;
public class BST {
	BNode root;

	BST(){
		root=null;
	}

	void insert(Country country) {
		root=insertRec(root,country);
	}
	BNode insertRec(BNode root,Country country) {
		if(root==null) {
			root=new BNode(country);
			return root;
		}

		if(country.name.compareTo(root.info.name)<0) root.left=insertRec(root.left,country);
		else if(country.name.compareTo(root.info.name)>0) root.right=insertRec(root.right,country);

		return root;
	}

	public void levelOrderTraversal() {
		if (root == null) {
			System.out.println("Tree is empty");
			return;
		}
		Queue<BNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			BNode tempNode = queue.poll();
			System.out.println("Country: " + tempNode.info.name + ", Population: " + tempNode.info.population);

			if (tempNode.left != null) queue.add(tempNode.left);
			if (tempNode.right != null) queue.add(tempNode.right);
		}
	}

	public String findMaxPopulation() {
		return findMaxPopulationRec(root).info.name;
	}
	private BNode findMaxPopulationRec(BNode root) {
		if (root == null) return null;
		
		BNode maxNode = root;
		BNode leftMax = findMaxPopulationRec(root.left);
		BNode rightMax = findMaxPopulationRec(root.right);

		if (leftMax != null && leftMax.info.population > maxNode.info.population) maxNode = leftMax;
		if (rightMax != null && rightMax.info.population > maxNode.info.population) maxNode = rightMax;
		
		return maxNode;
	}

	public String findMinPopulation() {
		return findMinPopulationRec(root).info.name;
	}
	private BNode findMinPopulationRec(BNode root) {
		if (root == null) return null;
		
		BNode minNode = root;
		BNode leftMin = findMinPopulationRec(root.left);
		BNode rightMin = findMinPopulationRec(root.right);

		if (leftMin != null && leftMin.info.population < minNode.info.population) minNode = leftMin;
		if (rightMin != null && rightMin.info.population < minNode.info.population) minNode = rightMin;
		
		return minNode;
	}
}