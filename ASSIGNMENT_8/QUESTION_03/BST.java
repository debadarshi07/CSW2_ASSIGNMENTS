package Q03;

public class BST {
	BNode root;
	
	BST(){
		this.root=null;
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
}
