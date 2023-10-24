package hashmap;

import java.util.HashMap;
import java.util.Set;

public class Sample1 
{

	public static void main(String[] args) 
	{
	
		HashMap<Integer, String> mp = new HashMap();
		
		//1.Put(key , value) -> to add values
		mp.put(101, "Sourabh");
		mp.put(102, "Aankita");
		mp.put(103, "Tanay");	
		System.out.println(mp);
		
		//2. TO update any existing value
		mp.put(102, "Ankita");
		System.out.println(mp);
		
		//3. To check if given key is present or not
		System.out.println(mp.containsKey(102));
		
		
		//4. To get any specific key
		System.out.println(mp.get(102));
		
		System.out.println("------------");
		
		//5. Get all the keys
		Set<Integer> allKeys = mp.keySet();
		for(Integer key : allKeys)
		{
			System.out.println(key);
		}
		
		System.out.println("------------");
		
		//6. To get all keys and values
		for(Integer key : allKeys)
		{
			System.out.println(key + "-" + mp.get(key));
		}
	}
	
}
