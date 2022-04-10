package Scaler_Problems;
/*
 * 
 * Problem Description
You are given a string A of size N.

Return the string A after reversing the string word by word.

NOTE:

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.


Problem Constraints
1 <= N <= 3 * 105



Input Format
The only argument given is string A.



Output Format
Return the string A after reversing the string word by word.



Example Input
Input 1:
    A = "the sky is blue"
Input 2:
    A = "this is ib"


Example Output
Output 1:
    "blue is sky the"
Output 2:
    "ib is this"    
 */

public class StringsReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String A = "the sky is blue";
		 System.out.println(solve(A));

	}
	 public static String solve(String A) {

	        StringBuilder sb = new StringBuilder(A.trim());
			swap(sb,0,sb.length()-1);
			int left =0;
			int right =0;
			while(left<sb.length())
			{
				if(right<sb.length() && sb.charAt(right) != ' ' )
					right++;
				else
				{
					swap(sb,left,right-1);
					left = right+1;
					right = left;
				}
			}
	        return sb.toString();
	    }
	   public static StringBuilder swap(StringBuilder sb , int start, int end)
		{
			while(start<end)
			{
				char ch =  sb.charAt(start);
			 	sb.setCharAt(start, sb.charAt(end));
			 	sb.setCharAt(end, ch);
			 	start++;
			 	end--;
			}
			return sb;
		}

}
