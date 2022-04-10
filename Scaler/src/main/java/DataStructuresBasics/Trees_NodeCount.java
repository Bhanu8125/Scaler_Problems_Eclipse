package DataStructuresBasics;

public class Trees_NodeCount {
	
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

	    public int solve(TreeNode A) {
	        if(A==null)
	            return 0;
	        int left_nodes = solve(A.left);
	        int right_nodes = solve(A.right);
	        return left_nodes + right_nodes+1;
	    }
	  
}
