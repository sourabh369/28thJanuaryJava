package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example21_Arraylist 
{

	public static void main(String[] args) 
	{
	
		ArrayList al = new ArrayList();
		al.add("Sourabh");
		al.add(101);
		al.add(65.5f);
		al.add('A');
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		System.out.println(al.get(3));
		
		al.add(3 , "Ankita");
		System.out.println(al);
		
		al.remove(3);
		System.out.println(al);
		
		System.out.println("-----Print data using iterator-----");
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("-----Print data using Listiterator-----");
		ListIterator itr = al.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-----Print data using for loop-----");
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("-----Print data using for each loop-----");
		for(Object s1 : al)
		{
			System.out.println(s1);
		}
		
		System.out.println("-------------");
		al.clear();
		System.out.println(al.size());
		
		
	}
	
}
