package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example48_Hashset 
{

	public static void main(String[] args) 
	{
	
		HashSet hs = new HashSet();
		hs.add("Sourabh");
		hs.add(101);
		hs.add(65.5f);
		hs.add('A');
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		hs.add("Ankita");
		System.out.println(hs);
		
		hs.remove("Ankita");
		System.out.println(hs);
		
		System.out.println("------Print array using Iterator-----");
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("------Print array using For each loop------");
		for(Object s1 : hs)
		{
			System.out.println(s1);
		}
		
		System.out.println("---------------");
		hs.clear();
		System.out.println(hs.size());
	}
	
}
