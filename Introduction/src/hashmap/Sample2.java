package hashmap;

import java.util.HashMap;
import java.util.Set;

public class Sample2 
{

	public static void main(String[] args) 
	{
	
		HashMap<Character, Integer> mp = new HashMap();
		
		//1.To add key and value
		mp.put('a', 101);
		mp.put('b', 102);
		mp.put('c', 103);
		System.out.println(mp);
		
		//2. To update any existing value
		mp.put('b', 105);
		System.out.println(mp);
		
		//3. To check if any specific key is present or not
		System.out.println(mp.containsKey('a'));
		
		//4. To get any specific key
		System.out.println(mp.get('a'));
		
		System.out.println("-------------");
		//5. To get all the keys
		Set<Character> allKeys = mp.keySet();
		for(Character key : allKeys)
		{
			System.out.println(key);
		}
		
		//6. Get all keys and values
		System.out.println("----------");
		for(Character key : allKeys)
		{
			System.out.println(key + "-" + mp.get(key));
		}
		
		
	}
	
}
