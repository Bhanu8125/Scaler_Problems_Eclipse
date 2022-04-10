package Scaler_Problems;

import java.util.Arrays;

public class StringsLongestCommonprefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A[] = new String[]{"abcdefgh", "aefghijk", "abcefgh"};
		System.out.println(longestCommonPrefix(A));

	}
	  public static String longestCommonPrefix(String[] A) {
	        int min_length  = Integer.MAX_VALUE;
			Arrays.sort(A);
			for(int i=0;i<A.length;i++)
			{
				min_length = Math.min(min_length, A[i].length());
			}
			int index =-1;
			for(int i=0;i<min_length;i++)
			{
				if(A[0].charAt(i) != A[A.length-1].charAt(i)) {
					return A[0].substring(0,i);
				}
			}
	        return A[0].substring(0,min_length);
	    }

}
