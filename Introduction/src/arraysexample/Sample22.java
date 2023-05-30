package arraysexample;

import java.util.Arrays;

public class Sample22 
{

	public static void main(String[] args) 
	{
	
		int arr[] = new int[3];
		arr[0]=20;
		arr[1]=60;
		arr[2]=30;
		
		System.out.println(arr[0]);
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
		
	}
	
}
