package Q01;

public class BinarySearchTree {
	BSTNode root;
	
	BinarySearchTree(){
		this.root=null;
	}
	
	void insert(int key) {
		root=insertRec(root,key);
	}
	
	BSTNode insertRec(BSTNode root,int key) {
		if(root==null) {
			root=new BSTNode(key);
			return root;
		}
		if(key<root.info) root.left=insertRec(root.left,key);
		else if(key>root.info) root.right=insertRec(root.right,key);
		
		return root;
	}
}