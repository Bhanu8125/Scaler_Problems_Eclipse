package DataStructuresBasics;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LRU_Mentor<T> {

	private static final int T = 0;
	Map<T,T> cacheMap = new LinkedHashMap<>();
	// adding or updating value -> put(key, value)
	// get ->  get by key -> get(key)
	// to check if map already contains key -> containsKey(key)
	// cacheMap.size() -> size of map
	int capacity;
	public LRU_Mentor(int capacity) {
		this.capacity = capacity;
	}

	public T get(T key) {
		if(cacheMap.containsKey(key))
		{
			return cacheMap.get(key);
		}
		else
		{
			return key;
		}
	}

	public void set(T key, T value) {
		if(cacheMap.size()<capacity && !cacheMap.containsKey(key))
		{
			cacheMap.put(key, value);
		}
		else
		{

			Set<T> keys = cacheMap.keySet();
			if(keys.contains(key))
			{
				cacheMap.remove(key);
				cacheMap.put(key, value);
			}
			else if(cacheMap.size() != capacity)
			{
				cacheMap.put(key, value);
			}
			else
			{
				Iterator it = keys.iterator();
				Object k = it.next();
				cacheMap.remove(k);
				cacheMap.put(key, value);
			}		
			
		}

//	System.out.println(cacheMap);

	}

}
