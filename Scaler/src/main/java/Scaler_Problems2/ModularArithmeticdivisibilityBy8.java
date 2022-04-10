package Scaler_Problems2;
/*
 * Problem Description
You are given a number A in the form of a string. Check if the number is divisible by eight or not.

Return 1 if it is divisible by eight else, return 0.


Problem Constraints
1 <= length of the String <= 100000
'0' <= A[i] <= '9'


Input Format
The only argument given is a string A.


Output Format
Return 1 if it is divisible by eight else return 0.


Example Input
Input 1:
A = "16"
Input 2:

A = "123"


Example Output
Output 1:
1
Output 2:

0


Example Explanation
Explanation 1:
 16 = 8 * 2
Explanation 2:

123 = 15 * 8 + 3
 */

public class ModularArithmeticdivisibilityBy8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A= "123";
		System.out.println(solve(A));
	}

	public static int solve(String A) {
		int num =0;
		if(A.length()<=3)
			num = Integer.valueOf(A);
		else
			num = Integer.valueOf(A.substring(A.length()-3));

		if(num%8 == 0)
			return 1;
		else
			return 0;

	}
}
