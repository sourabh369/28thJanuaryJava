package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Example7_Hashset
{

	public static void main(String[] args) 
	{
	
		HashSet hs = new HashSet();		//duplicate data is not allowed
		hs.add("Sourabh");
		hs.add(101);
		hs.add(65.5f);
		hs.add('A');
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		
		hs.add(30);
		System.out.println(hs);
		
		hs.remove(30);
		System.out.println(hs);
		
		System.out.println("----Print data using iterator cursor---");
		Iterator it = hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}
	
}
