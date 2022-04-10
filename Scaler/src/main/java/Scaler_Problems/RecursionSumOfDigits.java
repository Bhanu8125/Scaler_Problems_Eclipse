package Scaler_Problems;

public class RecursionSumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 24537;
		System.out.println(solve(A));

	}
	 public static  int solve(int A) {
	        if(A<10) return A;
	        
	        return A%10 + solve(A/10);
	    }

}
