package Scaler_Problems;
/*
 * Problem Description

Akash likes playing with strings. One day he thought of applying following operations on the string in the given order:

Concatenate the string with itself.
Delete all the uppercase letters.
Replace each vowel with '#'.
You are given a string A of size N consisting of lowercase and uppercase alphabets. Return the resultant string after applying the above operations.

NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.



Problem Constraints

1<=N<=100000


Input Format

First argument is a string A of size N.



Output Format

Return the resultant string.



Example Input

A="AbcaZeoB"



Example Output

"bc###bc###"



Example Explanation

First concatenate the string with itself so string A becomes "AbcaZeoBAbcaZeoB".
Delete all the uppercase letters so string A becomes "bcaeobcaeo".
Now replace vowel with '#'.
A becomes "bc###bc###".
 */
public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A="AbcaZeoB";
		System.out.println(solve(A));

	}
	
	 public static String solve(String A) {
	     StringBuilder sb = new StringBuilder();
	     String vowels ="aeiou";
	     for(int i=0;i<A.length();i++)
	     {
	          if(vowels.indexOf(A.charAt(i))!=-1)
	             sb.append('#');
	          else if(!(A.charAt(i)>='A' && A.charAt(i)<='Z'))
	             sb.append(A.charAt(i));
	     }
	     return (sb.append(sb).toString());
	 }
}
	// public class Solution {
//  public String solve(String A) {
//      StringBuilder sb = new StringBuilder(A);
//      String vowels ="aeiou";
//      for(int i=0;i<sb.length();i++)
//      {
//          if(sb.charAt(i)>='A' && sb.charAt(i)<='Z') {
//              sb.deleteCharAt(i);
//              i--;
//          }
//         // System.out.println(sb.toString() +"...." + sb.length() +"....."+ i);
//          if(i!=-1 && i!= sb.length() && vowels.indexOf(sb.charAt(i))!=-1)
//              sb.setCharAt(i, '#');
//      }
//      return (sb.append(sb).toString());
//  }
//}







