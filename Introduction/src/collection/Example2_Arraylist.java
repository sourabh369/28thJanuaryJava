package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example2_Arraylist
{

	public static void main(String[] args) 
	{
	
		ArrayList al = new ArrayList();
		al.add("Rahul");
		al.add(101);
		al.add(72.4f);
		al.add('A');
		al.add(50);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.get(3));
		
		al.add(2, "Ankita");
		System.out.println(al);
		
		al.remove(2);
		System.out.println(al);
		
		System.out.println("----Print data using iterator cursor----");
		
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("----Print data using Listiterator cursor----");
		
		ListIterator itr = al.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("----Print data using for loop----");
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("----Print data using for each loop----");
		
		for( Object a: al)
		{
			System.out.println(a);
		}
		
		
	}
	
}
