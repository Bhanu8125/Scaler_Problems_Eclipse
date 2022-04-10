package Scaler_Problems_Arrays;
/*
 * Problem Description
You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.



Problem Constraints
1 <= |A| <= 105

0 <= A[i] <= 109



Input Format
The first argument is an integer array A.



Output Format
Return the second largest element. If no such element exist then return -1.



Example Input
Input 1:

 A = [2, 1, 2] 
Input 2:

 A = [2]


Example Output
Output 1:

 2 
Output 2:

 -1 


Example Explanation
Explanation 1:

 First largest element = 2
 Second largest element = 2
 Third largest element = 1
Explanation 2:

 There is no second largest element in the array.
 */

public class BasicArraysSecondElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {2, 1, 2};
		System.out.println(solve(A));

	}
	public static  int solve(int[] A) {
        if(A.length==1) return -1;
        int first_max= A[0];
        int sec_max= A[0];
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>first_max)
            {
                sec_max = first_max;
                first_max = A[i];
            }
            else if(A[i]> sec_max && A[i]<first_max)
            {
                sec_max= A[i];
            }
        }
        return sec_max;
    }

}
