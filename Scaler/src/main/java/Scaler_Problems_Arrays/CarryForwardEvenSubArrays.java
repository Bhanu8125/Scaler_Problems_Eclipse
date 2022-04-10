package Scaler_Problems_Arrays;
/*
 * Problem Description
You are given an integer array A.

Decide whether it is possible to divide the array into one or more subarrays of even length such that the first and last element of all subarrays will be even.

Return "YES" if it is possible; otherwise, return "NO" (without quotes).



Problem Constraints
1 <= |A|, A[i] <= 106



Input Format
The first and the only input argument is an integer array, A.



Output Format
Return a string "YES" or "NO" denoting the answer.



Example Input
Input 1:

 A = [2, 4, 8, 6]
Input 2:

 A = [2, 4, 8, 7, 6]


Example Output
Output 1:

 "YES"
Output 2:

 "NO"


Example Explanation
Explanation 1:

 We can divide A into [2, 4] and [8, 6].
Explanation 2:

 There is no way to divide the array into even length subarrays.
 */
public class CarryForwardEvenSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] =  new int[] {2, 4, 8, 7, 6};
		System.out.println(solve(A));

	}
	public static  String solve(int[] A) {
        int last_even_index=-1;
        int last_odd_index=-1;
        if(A[0]%2==1 || A[A.length-1]%2==1 || A.length %2 ==1)
        return "NO";
        // else
        // return "YES";


        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2==0 &&  i%2==0 && last_odd_index == -1)
            {
                last_even_index = i;
            }
            else if(A[i]%2 == 1)
            {
                last_odd_index=i;
            }
            if(last_odd_index < i && last_odd_index != -1)
            {
                int length = i-last_even_index+1;
                if(length%2==0)
                {
                    last_odd_index = -1;
                // last_even_index = -1;
                }
            }
        }
        if(last_odd_index == -1)
        {
            return "YES";
        }
        else
        {
            return "NO";
        }
    }

}
