package Scaler_Problems;

import java.util.HashMap;

/*
 * Problem Description
Surprisingly, in an alien language, they also use English lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.

Given an array of words A of size N written in the alien language, and the order of the alphabet denoted by string B of size 26, return 1 if and only if the given words are sorted lexicographically in this alien language else, return 0.



Problem Constraints
1 <= N, length of each word <= 105

Sum of the length of all words <= 2 * 106



Input Format
The first argument is a string array A of size N.

The second argument is a string B of size 26, denoting the order.



Output Format
Return 1 if and only if the given words are sorted lexicographically in this alien language else, return 0.



Example Input
Input 1:

 A = ["hello", "scaler", "interviewbit"]
 B = "adhbcfegskjlponmirqtxwuvzy"
Input 2:

 A = ["fine", "none", "no"]
 B = "qwertyuiopasdfghjklzxcvbnm"


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 The order shown in string B is: h < s < i for the given words. So return 1.
Explanation 2:

 "none" should be present after "no". Return 0.
 */

public class HashingIsDictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A[] =  new String[] {"hello", "scaler", "interviewbit"};
		String B = "adhbcfegskjlponmirqtxwuvzy";
		System.out.println(solve(A,B));

	}
	
	 public static  int solve(String[] A, String B) {
	        HashMap<Character,Integer> Alphabets  = new HashMap<Character,Integer>();
			 for(int i =0;i<26;i++)
			 {
				 Alphabets.put(B.charAt(i), i);
			 }
			 for(int i=1;i<A.length;i++)
			 {
				if(A[i].length()<A[i-1].length())
					return 0;
				else
				{
					int index =0;
					while(index<A[i-1].length())
					{
						int char1 = Alphabets.get(A[i-1].charAt(index));
						int char2 = Alphabets.get(A[i].charAt(index));
						if(char1 < char2)
						{
							break;
						}
						else if(char1 > char2)
						{
							return 0;
						}
						index++;
					}
				}
			 }
			 return 1;
	    }

}
