package Scaler_Problems2;
/*
 * 
 * Problem Description
Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
Find the two integers that appear only once.



Problem Constraints
2 <= |A| <= 100000
1 <= A[i] <= 109



Input Format
The first argument is an array of integers of size N.



Output Format
Return an array of two integers that appear only once.



Example Input
Input 1:
A = [1, 2, 3, 1, 2, 4]
Input 2:

A = [1, 2]


Example Output
Output 1:
[3, 4]
Output 2:

[1, 2]


Example Explanation
Explanation 1:
3 and 4 appear only once.
Explanation 2:

1 and 2 appear only once.
 */
import java.util.Arrays;

public class BitManipulationSingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {1, 2, 3, 1, 2, 4};
		int res[] = solve(A);
		System.out.println(res[0] +" " + res[1]);

	}
	public static  int[] solve(int[] A) {
	       int xor = 0;
	        for(int i=0;i<A.length;i++)
	        {
	            xor^=A[i];
	        }
	       int pos = 0;
	       int j=0;
	       int first_value=xor, second_value = xor;
	       while((xor & (1<<pos)) == 0)
	       {
	           pos++;
	       }
	      // System.out.println(xor + "..." + pos);
	       for(int i=0;i<A.length;i++)
	       {
	           if((A[i] & (1<<pos))!=0)
	           {
	               first_value = first_value ^ A[i];
	           }
	           else
	           {
	               second_value = second_value ^ A[i];
	           }
	       }
	       int arr[] =new int[]{first_value,second_value};
	       Arrays.sort(arr);
	       return arr;
	       
	    }

}
