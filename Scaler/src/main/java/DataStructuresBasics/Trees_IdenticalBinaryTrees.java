package DataStructuresBasics;

public class Trees_IdenticalBinaryTrees {
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
	public class Solution {
	    public int isSameTree(TreeNode A, TreeNode B) {
	           if(A==null && B==null)
	                return 1;
	            else if(A==null || B==null)
	                return 0;
	            else if(A.val!=B.val)
	                return 0;
	           
	            
	            int left_check = isSameTree(A.left,B.left);
	            int right_check = isSameTree(A.right,B.right);
	            return (left_check & right_check);
	    }
	}


}
