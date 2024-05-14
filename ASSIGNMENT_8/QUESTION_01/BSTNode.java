package Q01;
public class BSTNode {
  int info;
  BSTNode left,right;
  BSTNode(int info){
    this.info=info;
    left=right=null;
  }
  void insert(int info){
    if(info<this.info){
      if(left==null)
        left=new BSTNode(info);
      else
        left.insert(info);
    }if(info>this.info){
      if(right==null)
        right=new BSTNode(info);
      else
        right=right.insert(info);
    }
  }
}
