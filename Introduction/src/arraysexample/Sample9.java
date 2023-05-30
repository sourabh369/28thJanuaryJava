package arraysexample;

import java.util.Arrays;

public class Sample9 
{

	public static void main(String[] args) 
	{
	
		String arr[] = new String[4];
		arr[0]="Rahul";
		arr[1]="Ganesh";
		arr[2]="Ramesh";
		arr[3]="Suresh";
		
		System.out.println(arr[1]);
	    System.out.println(arr.length);
	    System.out.println("----Print normal array---");
	    
	    for(int i=0;i<=arr.length-1;i++)
	    {
	    	System.out.println(arr[i]);
	    }
	    
	    System.out.println("----Print reverse array---");

	    for(int i=arr.length-1;i>=0;i--)
	    {
	    	System.out.println(arr[i]);
	    }
	    
	    Arrays.sort(arr);
	    
	    System.out.println("----Print ascending array---");

	    for(int i=0;i<=arr.length-1;i++)
	    {
	    	System.out.println(arr[i]);
	    }

	    System.out.println("----Print descending array---");

	    for(int i=arr.length-1;i>=0;i--)
	    {
	    	System.out.println(arr[i]);
	    }
	    
	    System.out.println("---------");
	    System.out.println(arr[0]);
	    System.out.println(arr[arr.length-1]);
	    

	}
	
}
