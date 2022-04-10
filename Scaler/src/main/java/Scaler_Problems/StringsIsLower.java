package Scaler_Problems;

public class StringsIsLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char A[] = new char[] {'S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};
		A = to_lower(A);
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i] + " ");
		}

	}
	public static char[] to_lower(char[] A) {
        for(int i=0;i<A.length;i++)
        {
            if(A[i] >='A' && A[i]<='Z')
            {
                A[i]^=32;
            }
        }
        return A;
    }

}
