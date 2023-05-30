package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example29_LinkedList 
{

	public static void main(String[] args) 
	{
	
		LinkedList ll = new LinkedList();
		ll.add("Sourabh");
		ll.add(101);
		ll.add(65.5f);
		ll.add('A');
		ll.add(null);
		ll.add(null);
		
		System.out.println(ll);
		System.out.println(ll.isEmpty());
		System.out.println(ll.size());
		System.out.println(ll.get(3));
		
		ll.add(3, "Ankita");
		System.out.println(ll);
		
		ll.remove(3);
		System.out.println(ll);
		
		System.out.println("-----Print data using iterator cursor-----");
		Iterator it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("-----Print data using Listiterator cursor-----");
		ListIterator itr = ll.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-----Print data using for loop-----");
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("-----Print data using for each loop-----");
		for(Object s1 : ll)
		{
			System.out.println(s1);
		}
		
		System.out.println("------------");
		ll.clear();
		System.out.println(ll.size());
		
		
		
		
		
		
	}
	
	
}
