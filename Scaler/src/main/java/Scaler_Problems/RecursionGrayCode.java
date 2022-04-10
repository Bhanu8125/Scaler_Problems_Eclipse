package Scaler_Problems;

import java.util.ArrayList;

public class RecursionGrayCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 3;
		System.out.println(grayCode(A));
		

	}
	public static ArrayList<Integer> grayCode(int a) {
        ArrayList<String> str_series = seriesFormation(a);
        ArrayList<Integer> series = new ArrayList<Integer>();
        for(String val:str_series)
        {
        	series.add(Integer.parseInt(val, 2));
        }
        return series;
	}
    public static ArrayList<String> seriesFormation(int a) {
        if(a==1)
        {
           ArrayList<String> basecase = new ArrayList<String>();
           basecase.add("0");
           basecase.add("1");
           return basecase;
        }
        
        ArrayList<String> base_set = seriesFormation(a-1);
        
        ArrayList<String> series = new ArrayList<String>();
        
        for(int i=0;i<base_set.size();i++)
        {
        	series.add("0"+base_set.get(i));
        }
        for(int i=base_set.size()-1;i>=0;i--)
        {
        	series.add("1"+base_set.get(i));
        }
        return series;
	}

}
