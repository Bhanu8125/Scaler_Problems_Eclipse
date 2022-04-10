package Scaler_Problems_Arrays;
/*
 * Problem Description
You are given an array A consisting of heights of Christmas trees and an array B of the same size consisting of the cost of each of the trees (Bi is the cost of tree Ai, where 1 ≤ i ≤ size(A)), and you are supposed to choose 3 trees (let's say, indices p, q, and r), such that Ap < Aq < Ar, where p < q < r.
The cost of these trees is Bp + Bq + Br.

You are to choose 3 trees such that their total cost is minimum. Return that cost.

If it is not possible to choose 3 such trees return -1.



Problem Constraints
1 <= A[i], B[i] <= 109
3 <= size(A) = size(B) <= 3000



Input Format
First argument is an integer array A.
Second argument is an integer array B.



Output Format
Return an integer denoting the minimum cost of choosing 3 trees whose heights are strictly in increasing order, if not possible, -1.



Example Input
Input 1:

 A = [1, 3, 5]
 B = [1, 2, 3]
Input 2:

 A = [1, 6, 4, 2, 6, 9]
 B = [2, 5, 7, 3, 2, 7]


Example Output
Output 1:

 6 
Output 2:

 7 


Example Explanation
Explanation 1:

 We can choose the trees with indices 1, 2 and 3, and the cost is 1 + 2 + 3 = 6. 
 */

public class ArraysChristmasTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]  = new int[] {1, 6, 4, 2, 6, 9};
		int B[]  = new int[] {2, 5, 7, 3, 2, 7};
		System.out.println(solve(A,B));

	}
	public static  int solve(int[] A, int[] B) {
        int min_cost = Integer.MAX_VALUE;
        int total_cost = Integer.MAX_VALUE;
        for(int i=1;i<A.length-1;i++)
        {
            int left_sum  = Integer.MAX_VALUE;
            int right_sum = Integer.MAX_VALUE ;
            // int min_tree = A[i];
            // int max_tree =  A[i];
            for(int j=i-1;j>=0;j--)
            {
                int sum = B[i] + B[j];
                if(A[i] > A[j] && sum < left_sum){
                    left_sum = sum;
                }
            }
            for(int j=i+1;j<A.length;j++)
            {
                int sum = B[i] + B[j];
                if(A[i] < A[j] && sum < right_sum){
                    right_sum = sum;
                }
                
            }
            if(left_sum != Integer.MAX_VALUE && right_sum != Integer.MAX_VALUE)
                total_cost = left_sum + right_sum -  B[i] ;
            if(min_cost > total_cost)
                min_cost = total_cost;
        }
        if(min_cost == Integer.MAX_VALUE)
        min_cost  = -1;
        return  min_cost;
    }

}
