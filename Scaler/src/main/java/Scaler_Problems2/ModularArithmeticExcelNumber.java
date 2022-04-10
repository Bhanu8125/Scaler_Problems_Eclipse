package Scaler_Problems2;
/*
 * 
 * Problem Description
Given a column title as appears in an Excel sheet, return its corresponding column number.



Problem Constraints
1 <= length of the column title <= 5



Input Format
The only argument is a string that represents the column title in the excel sheet.



Output Format
Return a single integer that represents the corresponding column number.



Example Input
Input 1:

 AB
Input 2:

 ABCD


Example Output
Output 1:

 28
Output 2:

 19010


Example Explanation
Explanation 1:

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28
 */

public class ModularArithmeticExcelNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A= "ABCD";
		System.out.println(titleToNumber(A));
		

	}
	public static  int titleToNumber(String A) {
        int ans =0;
        int exp =1;
        for(int i = A.length()-1;i>=0;i--)
        {
            int num = A.charAt(i) - 64;
            ans = ans + (num * exp);
            exp = exp*26;
        }
        return ans;
    }

}
