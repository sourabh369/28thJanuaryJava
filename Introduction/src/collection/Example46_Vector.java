package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Example46_Vector 
{

	public static void main(String[] args) 
	{
	
		Vector v = new Vector();
		v.add("Sourabh");
		v.add(101);
		v.add(65.5f);
		v.add('A');
		v.add(null);
		v.add(null);
		
		System.out.println(v);
		System.out.println(v.isEmpty());
		System.out.println(v.size());
		System.out.println(v.get(3));
		
		v.add(3 , "Ankita");
		System.out.println(v);
		
		v.remove("Ankita");
		System.out.println(v);
		
		System.out.println("------Print array using Iterator-----");
		Iterator it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("------Print array using ListIterator-----");
		ListIterator itr = v.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("------Print array using For loop------");
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("------Print array using For each loop------");
		for(Object s1 : v)
		{
			System.out.println(s1);
		}
		
		System.out.println("------Print array using Enumeration------");
		Enumeration enu = v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		System.out.println("---------------");
		v.clear();
		System.out.println(v.size());
	}
	
}
