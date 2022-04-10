package Scaler_Problems;
/*
 * 
 * Problem Description
Given a string A consisting of lowercase characters.

Check if characters of the given string can be rearranged to form a palindrome.

Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.



Problem Constraints
1 <= |A| <= 105

A consists only of lower-case characters.



Input Format
First argument is an string A.



Output Format
Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.



Example Input
Input 1:

 A = "abcde"
Input 2:

 A = "abbaee"


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 No possible rearrangement to make the string palindrome.
Explanation 2:

 Given string "abbaee" can be rearranged to "aebbea" to form a palindrome.
 */

import java.util.HashMap;
import java.util.Map;

public class HashingCheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A ="abcde";
		System.out.println(solve(A));

	}
	  public static int solve(String A) {

	        HashMap<Character,Integer> char_freq = new HashMap<Character,Integer>();
			for(int i=0;i<A.length();i++)
			{
				if(char_freq.containsKey(A.charAt(i)))
				{
					char_freq.put(A.charAt(i),(char_freq.get(A.charAt(i)) + 1));
					//System.out.println(",,,,");
				}
				else
				{
					char_freq.put(A.charAt(i),1);
				}
			}
			//System.out.println(char_freq);
			if(A.length()%2==0)
			{
				boolean isOddFreq = false;
				for(Map.Entry<Character, Integer> freq : char_freq.entrySet())
				{
					if(freq.getValue()%2==1) {
						isOddFreq = true;
						break;
					}
				}
				if(!isOddFreq)
					return 1;
			}
			else
			{
				int odd_pair = 0;
				for(Map.Entry<Character, Integer> freq : char_freq.entrySet())
				{
					if(freq.getValue()%2==1)
						odd_pair++;
				}
				if(odd_pair ==1)
					return 1;
			}
			return 0;
	    }

}
