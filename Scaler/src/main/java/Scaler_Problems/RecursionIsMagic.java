package Scaler_Problems;

public class RecursionIsMagic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A =546575;
		System.out.println(solve(A));;

	}
	 public static int solve(int A) {
     	if(A==1) return 1;
		else if(A<10) return 0;
		
		return solve(A%10 + A/10);
 }

}
