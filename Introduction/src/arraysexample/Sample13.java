package arraysexample;

import java.util.Arrays;

public class Sample13 
{

	public static void main(String[] args) 
	{
	
		int arr[] = {10 , 50 , 5 , 1};
		
		System.out.println(arr[1]);
		System.out.println(arr.length);
		
		System.out.println("-----Print normal array----");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("-----Print reverse array----");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		Arrays.sort(arr);
		
		System.out.println("----Print ascending order array---");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("----Print descending order array---");

		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Print smallest and largest number");
		
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);
		
	}
	
}
