package Scaler_Problems;

public class StringsLongestPalindromicSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A ="abbbbbbb";
		System.out.println(longestPalindrome(A));

	}
	public static  String longestPalindrome(String A) {
		int pal_length =0;
		StringBuilder ans = new StringBuilder();
		for(int i=0;i<A.length();i++)
		{
			String pal =  expand(A,i,i);
			if(pal_length<pal.length())
			{
				pal_length =  pal.length();
				ans  = new StringBuilder(pal);
			}
		}

		for(int i=0;i<A.length();i++)
		{
			String pal =  expand(A,i,i+1);
			if(pal_length<pal.length())
			{
				pal_length =  pal.length();
				ans  = new StringBuilder(pal);
			}
		}
		return ans.toString();

	}
	public static  String expand(String A,int p1, int p2)
	{
		while(p1>=0 && p2<A.length() && A.charAt(p1)==A.charAt(p2))
		{
			p1--;
			p2++;
		}
		return A.substring(p1+1,p2);
	}

}
