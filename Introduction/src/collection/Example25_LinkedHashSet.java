package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Example25_LinkedHashSet 
{

	public static void main(String[] args) 
	{
	
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Sourabh");
		lhs.add(101);
		lhs.add(65.5f);
		lhs.add('A');
		lhs.add(null);
		
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		
		System.out.println("-------Print data using iterator cursor-------");
		Iterator it = lhs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("-------Print data using for each loop-------");
		for(Object s1 : lhs)
		{
			System.out.println(s1);
		}
		
		System.out.println("---------");
		lhs.clear();
		System.out.println(lhs.size());
		
	}
	
}
