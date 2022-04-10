package Scaler_Problems2;
/*
 * Problem Description

Write a function that takes an integer and returns the number of 1 bits it has.


Problem Constraints

1 <= A <= 109


Input Format

First and only argument contains integer A


Output Format

Return an integer as the answer


Example Input

Input1:
11


Example Output

Output1:
3


Example Explanation

Explaination1:
11 is represented as 1011 in binary.
 */
public class BitManipulationNumberOfOneBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 11;
		System.out.println(numSetBits(A));

	}
	public static  int numSetBits(int A) {
        String binary = null;
       while(A>0)
       {
           int rem = A%2;
           binary = String.valueOf(rem) +binary;
           A=A/2;
       }
      int count = (int)binary.chars().filter(ch -> ch == '1').count();
    return count;

    }

}
