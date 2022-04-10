package Scaler_Problems;

public class RecusionKthSymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=4;
		int B= 7;
		System.out.println(solve(A,B));

	}
	 public static int solve(int A, int B) {
	        if(A==1) return 0;
			int length = (int) Math.pow(2,(A-1));
			
			if(B <= length/2)
			{
				return solve(A-1,B);
			}
			else
			{
				return 1-solve(A-1,B-(length/2));
			}
	    }

}
