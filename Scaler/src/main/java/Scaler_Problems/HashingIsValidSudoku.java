package Scaler_Problems;

import java.util.HashSet;

public class HashingIsValidSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A[] =  new String[] {"53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"};
		System.out.println(isValidSudoku(A));
	}
	
	public static int isValidSudoku(final String[] A) {
        
		 HashSet<Character> block_1 = new HashSet<Character>();
		 HashSet<Character> block_2 = new HashSet<Character>();
		 HashSet<Character> block_3 = new HashSet<Character>();
		 for(int i=0;i<A.length;i++)
		 {
			 HashSet<Character> row_Check =  new HashSet<Character>();
			 HashSet<Character> col_Check = new HashSet<Character>();
			 for(int j=0,k=0;j<9;j++,k++)
			 {
				 if(col_Check.contains(A[k].charAt(i)))
				 {
					// System.out.println("col_check  " + col_Check);
					return 0; 
				 }
				 else 
				 {
					 if(A[k].charAt(i) != '.')
						 col_Check.add(A[k].charAt(i));	
				 }
				 
				 if(row_Check.contains(A[i].charAt(j)))
				 {
					// System.out.println("row_Check  " + row_Check + "   " +i +"   " +j);
					 return 0;
				 }
				 else
				 {
					 if(A[i].charAt(j) != '.')
						 row_Check.add(A[i].charAt(j));
				 }
				 if(j<=2)
				 {
					 if(block_1.contains(A[i].charAt(j)))
					 {
						// System.out.println("block_1 " + block_1);
						 return 0;
					 }
					 else
					 {
						 if(A[i].charAt(j) != '.')
							 block_1.add(A[i].charAt(j));
					 }
				 }
				 else if(j<=5)
				 {
					 if(block_2.contains(A[i].charAt(j)))
					 {
						// System.out.println("block_2 " + block_2);
						 return 0;
					 }
					 else
					 {
						 if(A[i].charAt(j) != '.')
							 block_2.add(A[i].charAt(j));
					 }
					 
				 }
				 else if(j<=8)
				 {
					 if(block_3.contains(A[i].charAt(j)))
					 {
						 //System.out.println("block_3 " + block_3); 
						 return 0;
					 }
					 else
					 {
						 if(A[i].charAt(j) != '.')
							 block_3.add(A[i].charAt(j));
					 }
					 
				 }
					 	
			 }
			 if(i%3==2)
			 {
				// System.out.println("clear_block   " + block_1 +"    " + block_2 +"   "+block_3);
				 block_1.clear();
				 block_2.clear();
				 block_3.clear();
			 }
		 }
		 
		 return 1;
   }

}
