package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Example26_Treeset 
{

	public static void main(String[] args) 
	{
	
		TreeSet ts = new TreeSet();  //homogeneous data present
		ts.add("Sourabh");
		ts.add("Ankita");
		ts.add("Tanay");
		ts.add("Subhash");
		ts.add("Geeta");
		
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.isEmpty());
		
		ts.add("Swaraj");
		System.out.println(ts);
		System.out.println("-------------");
		System.out.println(ts.first());
		System.out.println("-----------");
		System.out.println(ts.last());
		
		ts.pollFirst();
		System.out.println(ts);
		ts.pollLast();
		System.out.println(ts);
		
		ts.add("Ankita");
		ts.add("Tanay");
		
		System.out.println("------Print data using iterator cursor-----");
		Iterator it = ts.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("------Print data using for each loop-----");
		for(Object s1 : ts)
		{
			System.out.println(s1);
		}
		
		System.out.println("--------");
		ts.clear();
		System.out.println(ts.size());
		
	}
	
}
