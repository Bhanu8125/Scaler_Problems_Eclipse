package Scaler_Problems_Arrays;
/*
 * Write a program to input an integer N from user and print hollow diamond star pattern series of N lines.

See example for clarifications over the pattern.



Problem Constraints

1 <= N <= 1000



Input Format

First line is an integer N



Output Format

N lines conatining only char '*' as per the question.



Example Input

Input 1:

4
Input 2:

6


Example Output

Output 1:

********
***  ***
**    **
*      *
*      *
**    **
***  ***
********
Output 2:

************
*****  *****
****    ****
***      ***
**        **
*          *
*          *
**        **
***      ***
****    ****
*****  *****
************
 */

import java.util.Scanner;

public class ArraysStarPattern {

	 public static void main(String[] args) {
	        // YOUR CODE GOES HERE
	        // Please take input and print output to standard input/output (stdin/stdout)
	        // DO NOT USE ARGUMENTS FOR INPUTS
	        // E.g. 'Scanner' for input & 'System.out' for output
	        Scanner in = new Scanner(System.in);
	        int num = in.nextInt();
	        for(int i=num;i>0;i--)
	        {
	            for(int j=1;j<=2*num;j++)
	            {
	                if(j<=i || j>2*num - i)
	                System.out.print("*");
	                else
	                System.out.print(" ");
	            }
	            System.out.println();
	        }
	        for(int i=1;i<=num;i++)
	        {
	            for(int j=1;j<=2*num;j++)
	            {
	                if(j<=i || j>2*num -i)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }      
	    }

}
