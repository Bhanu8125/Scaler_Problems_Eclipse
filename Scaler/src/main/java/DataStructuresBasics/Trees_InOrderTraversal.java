package DataStructuresBasics;

import java.util.ArrayList;


  //Definition for binary tree
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
 

public class Trees_InOrderTraversal {
	
	
	 ArrayList<Integer> elements = new ArrayList<Integer>();
	    public ArrayList<Integer> inorderTraversal(TreeNode A) {
	        inOrder(A); 

	        return elements;
	    }
	    public void inOrder(TreeNode A)
	    {
	        if(A==null)
	            return;
	        inOrder(A.left);
	        elements.add(A.val);
	        inOrder(A.right);
	    }

}
