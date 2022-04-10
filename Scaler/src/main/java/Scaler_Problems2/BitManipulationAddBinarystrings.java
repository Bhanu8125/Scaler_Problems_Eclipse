package Scaler_Problems2;
/*
 * Problem Description

Given two binary strings, return their sum (also a binary string).
Example:

a = "100"

b = "11"
Return a + b = "111".

 */

public class BitManipulationAddBinarystrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "100";

		String B = "11";
		System.out.println(addBinary(A,B));

	}
	public static  String addBinary(String A, String B) {
		 String res="";
		 
		 if(A.length()>B.length())
		 {
		     int len = A.length() - B.length();
		     for(int i=0;i<len;i++)
		     {
		         B = "0" + B;
		     }
		 }
		 else if(B.length() > A.length())
		 {
		     int len = B.length() - A.length();
		     for(int i=0;i<len;i++)
		     {
		         A = "0" +A;
		     }
		 }

		 int carry =0;
		 int sum =0;
		 for(int i=A.length()-1;i>=0;i--)
		 {
		     int bit_1 = A.charAt(i) -'0';
		     int bit_2 = B.charAt(i) -'0';
		     
		     sum = bit_1 ^ bit_2 ^ carry;
		     res = String.valueOf(sum) + res;
		     carry = (bit_1 & bit_2) | (bit_2 & carry) | (bit_1 & carry);
		 }
		 if(carry ==1)
		     res = "1" + res;
		 return res;    


		}

}
//public class Solution {
//public String addBinary(String A, String B) {
//Integer sum=0,carry=0;
//  String res="";
//  for(int i=A.length()-1,j=B.length()-1;i>=0 ||j>=0;i--,j--)
//  {
//       if(i>=0 &&j>=0)
//       {
//           sum =  Character.getNumericValue(A.charAt(i)) + Character.getNumericValue(B.charAt(j)) +carry; 
//       }
//       else if(i>=0)
//       {
//           sum = Character.getNumericValue(A.charAt(i))+carry;
//       }
//       else if(j>=0)
//       {
//            sum = Character.getNumericValue(B.charAt(j))+carry;
//       }
//       carry = sum/2;
//       sum=sum%2;
//       res = String.valueOf(sum) + res;
//       //System.out.print("sum :" + sum +"    carry :"+carry +"\n");
         
//  }
//  if(carry==1)
//  res = "1" +res;
//  return res;
//}
//}






