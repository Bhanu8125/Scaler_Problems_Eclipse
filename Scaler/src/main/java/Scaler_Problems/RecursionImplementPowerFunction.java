package Scaler_Problems;

public class RecursionImplementPowerFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = -1;
		int B = 1;
		int C= 20;
		System.out.println(pow(A,B,C));

	}
	 public static  int pow(int A, int B, int C) {
	      if(A==0) return 0;
			if(B==0)  return 1;
			
			long halfpower = pow(A,B/2,C);
			if(B%2==0)
			{
				return (int) (halfpower%C * halfpower%C)%C;
			}
			else
			{
				return (int) (((halfpower%C*halfpower%C*A)%C)+C)%C;
			}
	    }

}
