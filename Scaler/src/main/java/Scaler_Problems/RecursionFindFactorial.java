package Scaler_Problems;

public class RecursionFindFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 7;
		System.out.println(solve(A));
		

	}
	 public static int solve(int A) {
	        if(A==0 || A==1)
	            return 1;
	        
	        return A*solve(A-1);

	    }

}
