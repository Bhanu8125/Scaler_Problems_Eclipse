package Scaler_Problems;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
public class StringsChangeCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "abcabbccd";
		int B = 3;
		System.out.println(solve(A,B));

	}
	
	 public static int solve(String A, int B) {
	       // if(B==0) return A.length();
	        Integer count = Integer.valueOf(B);
	        StringBuilder sb = new StringBuilder(A);
			Map<Character,Integer> freq =  new HashMap<Character,Integer>();
			for(int i=0;i<sb.length();i++)
			{
				if(freq.containsKey(Character.valueOf(sb.charAt(i)))) {
					Integer val =  freq.get(Character.valueOf(sb.charAt(i)))  + 1;
					freq.put(Character.valueOf(sb.charAt(i)), val);
					//System.out.println(freq.get(Character.valueOf(sb.charAt(i)))+"..." + sb.charAt(i));
				}
				else {
					freq.put(Character.valueOf(sb.charAt(i)), 1);
				//	System.out.println(freq.get(Character.valueOf(sb.charAt(i))) +";;;" + sb.charAt(i));
				}
			}
			 Map<Character, Integer> result = freq.entrySet().stream()
		                .sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
		                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
		                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
			
			// System.out.println(result);
			 for(Entry<Character,Integer> entry : result.entrySet())
			 {
				Integer val = entry.getValue() - count ;
				if(val <=0)
				{
					freq.remove(entry.getKey());
				}
				count= val*-1;
			 }
	        return freq.size();
	    }

}
