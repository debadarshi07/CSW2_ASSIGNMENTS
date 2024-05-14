package Q02;
public class BinarySearchTree{
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
	
	void inorderTraversal() {
		System.out.print("In-Order traversal: ");
		inorder(root);
		System.out.println();
	}
	void inorder(BSTNode root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.info+" ");
			inorder(root.right);
		}
	}
	
	
	void preorderTraversal() {
		System.out.print("Pre-Order traversal: ");
		preorder(root);
		System.out.println();
	}
	void preorder(BSTNode root){
		if(root!=null) {
			System.out.print(root.info+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	
	void postorderTraversal() {
		System.out.print("Post-Order traversal: ");
		postorder(root);
		System.out.println();
	}
	void postorder(BSTNode root) {
		if(root!=null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.info+" ");
		}
	}
}
