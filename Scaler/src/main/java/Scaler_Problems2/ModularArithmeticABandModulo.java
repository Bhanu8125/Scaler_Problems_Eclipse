package Scaler_Problems2;
/*
 * Problem Description
Given two integers A and B, find the greatest possible positive integer M, such that A % M = B % M.



Problem Constraints
1 <= A, B <= 109
A != B



Input Format
The first argument is an integer A.
The second argument is an integer B.



Output Format
Return an integer denoting the greatest possible positive M.



Example Input
Input 1:

A = 1
B = 2
Input 2:

A = 5
B = 10


Example Output
Output 1:

1
Output 2:

5


Example Explanation
Explanation 1:

1 is the largest value of M such that A % M == B % M.
Explanation 2:

For M = 5, A % M = 0 and B % M = 0.

No value greater than M = 5, satisfies the condition.
 */

public class ModularArithmeticABandModulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 5;
		int B = 10;
		System.out.println(solve(A,B));
	}

	public static int solve(int A, int B) {	
		return Math.abs(A-B);
		
		
//
//		If a and b are the numbers, then we consider:
//		a = nx + r
//		b = ny + r
//		Where n is the modulus we want to find, and r is the common remainder. So,
//
//		a - b = n(x - y)   
//		=> n = (a-b)/(x-y)
//		Maximum n is achieved with x - y = 1. So,
//
//		n = a - b
		
		
		
		// int C= 0;
		// while(A!=B)
		// {
		//     if(A>B)
		//         C=A-B;
		//     else
		//         C=B-A;
		//     if(A%C == B%C)
		//         break;
		// }
		// return C;
	}
	
}


