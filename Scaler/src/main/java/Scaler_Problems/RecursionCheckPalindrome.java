package Scaler_Problems;

public class RecursionCheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  A = "bobob";
		System.out.println(solve(A));

	}
	  public static  int solve(String A) {
			return isPalindrome(A,0,A.length()-1);
	    }
		public static int isPalindrome(String A, int index1,int index2)
		{
			if(index1>index2) 
			{
				return 1;
			}
			
			if(A.charAt(index1) != A.charAt(index2))
			{
				return 0;
			}
			else
			{
				return isPalindrome(A,index1+1,index2-1);
			}
		}

}
