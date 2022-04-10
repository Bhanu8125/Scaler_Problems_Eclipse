package DataStructuresBasics;

import java.util.ArrayList;

public class Trees_PostOrderTraversal {
	
	/**
	 * Definition for binary tree
	 * class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) {
	 *      val = x;
	 *      left=null;
	 *      right=null;
	 *     }
	 * }
	 */
	
	    ArrayList<Integer> elements = new ArrayList<Integer>();
	    public ArrayList<Integer> postorderTraversal(TreeNode A) {
	        postOrder(A);

	        return elements;
	    }

	    public void postOrder(TreeNode A)
	    {
	        if(A==null)
	            return ;

	        postOrder(A.left);
	        postOrder(A.right);
	        elements.add(A.val);
	    }
	


}
