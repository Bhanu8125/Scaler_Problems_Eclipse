package Scaler_Problems;
/*Given an array A of integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.

Example :

Input :

A : [1 5 3]
k : 2
Output :

1
as 3 - 1 = 2

Return 0 / 1 for this problem.
 */
import java.util.HashSet;

public class HashingDiffKII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {1 ,5 ,3};
		int B =2;
		System.out.println(diffPossible(A,B));

	}
	 public static int diffPossible(final int[] A, int B) {
	       HashSet<Integer> freq = new HashSet<Integer>();
			for(int i=0;i<A.length;i++)
			{
				if(freq.contains(A[i] -B)|| freq.contains(A[i]+B))
				{
					return 1;
				}
				freq.add(A[i]);
			}
			
			return 0;
	    }

}
