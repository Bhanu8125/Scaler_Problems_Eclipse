package Scaler_Problems2;
/*
 * Problem Description

Reverse the bits of an 32 bit unsigned integer A.



Problem Constraints

0 <= A <= 232



Input Format

First and only argument of input contains an integer A.



Output Format

Return a single unsigned integer denoting the decimal value of reversed bits.



Example Input

Input 1:

 0
Input 2:

 3


Example Output

Output 1:

 0
Output 2:

 3221225472


Example Explanation

Explanation 1:

        00000000000000000000000000000000    
=>      00000000000000000000000000000000
Explanation 2:

        00000000000000000000000000000011    
=>      11000000000000000000000000000000
 */

public class BitManipulationReverseBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 long A =3;
	 System.out.println(reverse(A));

	}
	public static  long reverse(long a) {
	       String res = "";
	        long rev_num =0;
	        while(a>0)
	        {
	            long rem = a%2;
	            res +=rem;
	            a/=2;
	        }

	        for(int i=0,j=31;i<res.length();i++,j--)
	        {
	            long bit  = Long.valueOf(res.charAt(i)-'0');
	            long value = (long)Math.pow(2,j);
	            rev_num += (bit*value);
	        }
	        return rev_num;
	    }

}
