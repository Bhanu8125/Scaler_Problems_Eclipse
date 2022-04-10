package Scaler_Problems;

public class RecursionFindFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 10;
		System.out.println(findAthFibonacci(A));

	}
	 public static int findAthFibonacci(int A) {
     	if(A==0 || A==1)
		{
			return A;
		}
		return findAthFibonacci(A-1) + findAthFibonacci(A-2);
 }

}
