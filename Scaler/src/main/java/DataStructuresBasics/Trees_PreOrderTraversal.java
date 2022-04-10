package DataStructuresBasics;

import java.util.ArrayList;
/*
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
    val = x;
     left=null;
     right=null;
  }
}
*/
public class Trees_PreOrderTraversal {


	ArrayList<Integer> elements = new ArrayList<Integer>();
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        preOrder(A);
        
        return elements;
    }
    public void preOrder(TreeNode A)
    {
        if(A==null)
            return;
        
        elements.add(A.val);
        preOrder(A.left);
        preOrder(A.right);
    }
	

}
