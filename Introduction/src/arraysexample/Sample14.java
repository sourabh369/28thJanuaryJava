package arraysexample;

import java.util.Arrays;

public class Sample14 
{

	public static void main(String[] args) 
	{
	
		String arr[] = {"Ramesh" , "Suresh" , "Ganesh"};
		
		System.out.println(arr[0]);
		System.out.println(arr.length);
		
		System.out.println("----Print normal arrary-----");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		System.out.println("----Print reverse arrary-----");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		
		Arrays.sort(arr);
		
		System.out.println("----Print ascending arrary-----");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		System.out.println("----Print descending arrary-----");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
	}
	
}
