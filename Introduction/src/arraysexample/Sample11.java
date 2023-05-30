package arraysexample;

import java.util.Arrays;

public class Sample11 
{

	public static void main(String[] args) 
	{
	
		int arr[] = new int[4];
		arr[0]=60;
		arr[1]=20;
		arr[2]=10;
		arr[3]=70;
		
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
		
		
	}
	
}
