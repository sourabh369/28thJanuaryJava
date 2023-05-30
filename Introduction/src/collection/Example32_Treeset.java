package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Example32_Treeset
{
	
	public static void main(String[] args) 
	{
	
		TreeSet ts = new TreeSet();
		ts.add(105);
		ts.add(900);
		ts.add(20);
		ts.add(60);
		ts.add(90);
		
		System.out.println(ts);
		ts.add(8000);
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		ts.pollFirst();
		System.out.println(ts);
		ts.pollLast();
		System.out.println(ts);
		
		System.out.println("-----Print data using iterator cursor-----");
		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		System.out.println("-----Print data using for each loop-----");
		for(Object s1 : ts)
		{
			System.out.println(s1);
		}
		
		System.out.println("------------");
		ts.clear();
		System.out.println(ts.size());
		
	}
	
	
}
