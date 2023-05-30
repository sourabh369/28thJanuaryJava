package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Example5_Vector 
{

	public static void main(String[] args) 
	{
	
		Vector V = new Vector();    //by default size is 10 and size is increased by (current capacity*3/2) +1
		V.add("Rahul");
		V.add(101);
		V.add(65.5f);
		V.add('A');
		V.add(null);
		V.add(null);
		
		System.out.println(V);
		System.out.println(V.size());
		System.out.println(V.get(3));
		
		V.add(3, "Ankita");
		System.out.println(V);
		
		V.remove(3);
		System.out.println(V);
		
		System.out.println("---Print data using iterator cursor---");
		Iterator it = V.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("---Print data using Listiterator cursor---");
		ListIterator itr = V.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print data using for loop---");
		for(int i=0;i<=V.size()-1;i++)
		{
			System.out.println(V.get(i));
		}
		
		
		System.out.println("---Print data using for each loop---");
		for(Object a : V)
		{
			System.out.println(a);
		}
		
		
		System.out.println("---Print data using enumration----");
		Enumeration enu = V.elements();
		
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		
		V.clear();
		System.out.println(V);
		
		
	}
	
}
