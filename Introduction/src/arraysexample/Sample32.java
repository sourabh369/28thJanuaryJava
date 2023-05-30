package arraysexample;

import java.util.Arrays;

public class Sample32 
{

	public static void main(String[] args) 
	{
	
		int arr[] = new int[3];
		arr[0]=10;
		arr[1]=60;
		arr[2]=30;
		
		System.out.println(arr[1]);
		System.out.println(arr.length);
		
		System.out.println("----Print data in normal order----");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("----Print data in reverse order----");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		Arrays.sort(arr);
		
		System.out.println("----Print data in ascending order----");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("----Print data in descending order----");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		
		
	}
	
}
