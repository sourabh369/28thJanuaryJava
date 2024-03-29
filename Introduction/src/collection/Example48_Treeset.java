package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class Example48_Treeset 
{

	public static void main(String[] args) 
	{
	
		TreeSet ts = new TreeSet();
		ts.add("Sourabh");
		ts.add("Ankita");
		ts.add("Tanay");
		
		System.out.println(ts);
		System.out.println(ts.isEmpty());
		System.out.println(ts.size());
		System.out.println(ts.first());
		System.out.println(ts.last());

		ts.pollFirst();
		System.out.println(ts);
		
		ts.pollLast();
		System.out.println(ts);
		ts.add("Ankita");
		ts.add("Tanay");
		
		System.out.println("------Print array using Iterator-----");
		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("------Print array using For each loop------");
		for(Object s1 : ts)
		{
			System.out.println(s1);
		}
		
		System.out.println("---------------");
		ts.clear();
		System.out.println(ts.size());
	}
	
}
