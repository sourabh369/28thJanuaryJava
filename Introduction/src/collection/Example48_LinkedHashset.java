package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example48_LinkedHashset 
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
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.size());
		
		lhs.add("Ankita");
		System.out.println(lhs);
		
		lhs.remove("Ankita");
		System.out.println(lhs);
		
		System.out.println("------Print array using Iterator-----");
		Iterator it = lhs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("------Print array using For each loop------");
		for(Object s1 : lhs)
		{
			System.out.println(s1);
		}
		
		System.out.println("---------------");
		lhs.clear();
		System.out.println(lhs.size());
	}
	
}
