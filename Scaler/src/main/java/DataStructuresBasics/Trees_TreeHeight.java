package DataStructuresBasics;

public class Trees_TreeHeight {
	
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
	        int left = solve(A.left);
	        int right = solve(A.right);

	        return (Math.max(left,right)+1);
	    }

}
