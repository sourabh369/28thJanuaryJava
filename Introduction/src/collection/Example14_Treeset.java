package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Example14_Treeset 
{

	public static void main(String[] args) 
	{
	
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Sourabh");
		ts.add("Ankita");
		ts.add("Tanay");
		ts.add("Geeta");
		ts.add("Swaraj");
		
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.isEmpty());
		
		ts.add("Subhash");
		System.out.println(ts);
		
		ts.remove("Subhash");
		System.out.println(ts);
		
		System.out.println("------Print data using iterator cursor-----");
		
		Iterator it = ts.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("------Print data using for loop-----");
		
		for(String s1: ts)
		{
			System.out.println(s1);
		}
		
		ts.clear();
		System.out.println(ts.size());
		
	}
	
}
