package DataStructuresBasics;

public class Trees_CountingTheNodes {
	
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
	
	    int count = 0;
	    public int solve(TreeNode A) {
	        nodeCount(A,Integer.MIN_VALUE);
	        if(count==0)
	            return 1;
	        return count;
	    }
	    public int nodeCount(TreeNode A,int max)
	    {
	        if(A==null)
	            return 0;
	        nodeCount(A.left,Math.max(max,A.val));
	        nodeCount(A.right,Math.max(max,A.val));
	        if(A.val > max)
	        {
	            count++;
	        }
	        return A.val;

	    }

}
